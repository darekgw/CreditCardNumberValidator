package com.ig;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		CreditCardNumberValidator creditCardNumberValidator = new CreditCardNumberValidator();
		System.out.println("Please, insert card number to validate");
		Scanner sc = new Scanner (System.in);

		String userInput = sc.next();

		try{
			long cardNumber = Long.parseLong(userInput);
			boolean isCreditCardNumberValid = creditCardNumberValidator.validateCreditCardNumber(cardNumber);
			System.out.println(isCreditCardNumberValid);
		} catch (Exception e) {
			System.out.println("This is not a number. Please, insert card number.");
		}

	}
}
