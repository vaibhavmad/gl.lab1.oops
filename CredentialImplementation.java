package LAB1;

import java.util.Random;

public class CredentialImplementation implements CredentialService{
	String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String lowerChars = "abcdefghijklmnopqrstuvwxyz";
	String specialChars = "!@#$%^&*()_+-={}[]|:;,.<>?";
	String numbers = "0123456789";

	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {
	
		return firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + ".mycompany.com";
	}

	@Override
	public String generatePassword() {
		String upperChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerChars = "abcdefghijklmnopqrstuvwxyz";
		String specialChars = "!@#$%^&*()_+-={}[]|:;,.<>?";
		String numbers = "0123456789";

		String values = upperChars + lowerChars + numbers + specialChars;

		// Using Random Method

		Random rand = new Random();
		char[] password = new char[8];

		for (int i = 0; i < 8; i++) {

			password[i] = values.charAt(rand.nextInt(values.length()));
		}

		return String.valueOf(password);
	}

	@Override
	public void showCredentials(Employee employee) {
		System.out.println("Dear " + employee.getFirstName() + ", \nYour generated credentials are: ");
		System.out.println("Email: " + employee.getEmail() );
		System.out.println("Password: " + employee.getPassword());

	}
}
