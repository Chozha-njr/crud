package com.app.TDD.demo;

public class EmailValidator {

	private static final int MIN_LENGTH = 5;
	private static final int MAX_LENGTH = 50;

	public boolean isValidEmail(String email, boolean validateDomain) {

		if (email == null || email.length() < MIN_LENGTH || email.length() > MAX_LENGTH) {

			return false;
		}

		// Basic email validation logic

		String regex = "\"^[a-zA-Z0-9_+&*-]+(?:\\\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\\\.)+[a-zA-Z]{2,7}$\"";

		if (validateDomain) {

			regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@([a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
		}

		return email.matches(regex);
	}

}