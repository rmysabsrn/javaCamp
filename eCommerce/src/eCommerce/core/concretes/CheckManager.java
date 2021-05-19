package eCommerce.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerce.core.abstracts.CheckService;

public class CheckManager implements CheckService {

	@Override
	public boolean checkFirstName(String firstName) {
		if (firstName.length() < 2) {
			System.out.println(" Your name cannot be less than 2 characters.");
			return false;
		}

		return true;
	}

	@Override
	public boolean checkLastName(String lastName) {
		if (lastName.length() < 2) {
			System.out.println(" Your name cannot be less than 2 characters.");
			return false;

		}
		return true;
	}

	@Override
	public boolean checkEmail(String email) {
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);

		if (email.isEmpty()) {
			System.out.println("Enter your email.");
			return false;

		} else if (matcher.matches()) {
			return true;

		} else {
			System.out.println("Invalid email address");
			return false;
		}
	}

	@Override
	public boolean checkPassword(String password) {
		if (password.isEmpty()) {
			System.out.println("Please enter your password");
			return false;
		} else if (password.length() < 6) {
			System.out.println("Your password cannot be less than 6 characters.");
			return false;

		}
		return true;

	}

}