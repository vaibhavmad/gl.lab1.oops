package LAB1;

import java.util.Scanner;

public class GenerateEmail {

	public static void main(String[] args) {

			CredentialImplementation service = new CredentialImplementation();
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Your First Name: ");
			String firstName = sc.next();

			System.out.println("Enter your Second Name: ");
			String lastName = sc.next();

			Employee employee = new Employee(firstName, lastName);
			System.out.println("Please enter the department from the following: ");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");

			int option = sc.nextInt();
			String department = "";

			switch (option) {

			case 1:
				department = "tech";
				break;
			case 2:
				department = "admin";
				break;

			case 3:
				department = "hr";
				break;

			case 4:
				department = "legal";
				break;
				
			default:
				System.out.println("Invalid Input");
				break;
			}
			
			sc.close();
			
			String email = service.generateEmailAddress(firstName, lastName, department);
			employee.setEmail(email);
			
			String password = service.generatePassword();
			employee.setPassword(password);
			
			service.showCredentials(employee);
		}


	}
