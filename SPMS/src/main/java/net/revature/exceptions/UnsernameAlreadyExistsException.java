package net.revature.exceptions;

public class UnsernameAlreadyExistsException extends Exception {

	public UsernameAlreadyExistsException() {
		super("The username you have chosen already exists. Please select another.");
	}
}
