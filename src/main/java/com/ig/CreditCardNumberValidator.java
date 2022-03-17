package com.ig;

import java.util.ArrayList;
import java.util.List;

public class CreditCardNumberValidator {

	protected boolean validateCreditCardNumber(long creditCardNumber) {
		boolean isCreditCardNumberValid = false;
		List<Integer> splitNumbers = splitCreditCardNumber(creditCardNumber);
		int sum = calculateSum(splitNumbers);
		int outcome = sum % 10;
		if(outcome == 0) isCreditCardNumberValid = true;
		return isCreditCardNumberValid;
	}

	private List<Integer> splitCreditCardNumber(long creditCardNumber) {
		List<Integer> splitNumbers = new ArrayList<>();
		while (creditCardNumber > 0) {
			int nextNumber = (int) (creditCardNumber % 10);
			splitNumbers.add(nextNumber);
			creditCardNumber /= 10;
		}
		return splitNumbers;
	}

	private int calculateSum(List<Integer> splitNumbers) {
		int sum = 0;
		for (int i = 0; i < splitNumbers.size(); i++) {
			if (i == 0 || i % 2 == 0) {
				sum += splitNumbers.get(i);
			} else {
				int nextNumber = splitNumbers.get(i) * 2;
				if (nextNumber > 9) nextNumber -= 9;
				sum += nextNumber;
			}
		}
		return sum;
	}
}

