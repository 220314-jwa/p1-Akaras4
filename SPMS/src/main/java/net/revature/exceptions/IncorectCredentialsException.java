package net.revature.exceptions;

public class IncorectCredentialsException extends Exception {

	public IncorrectCredentialsException() {
		super("The username and/or password were incorrect.");
	}
}
