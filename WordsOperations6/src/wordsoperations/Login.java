package wordsoperations;

import java.util.Scanner;

public class Login {

	public static boolean validateAccount (Scanner reader, String user, String password) {

		//System.out.println(user);
		//System.out.println(password);

		int count = 1;
		String userConsole;
		String passwordConsole;
		System.out.println("\nLogin:");

		do {

			System.out.println("\nEnter Username : ");
			userConsole = reader.next();

			System.out.println("Enter Password : ");
			passwordConsole = reader.next();

			if (userConsole.equals(user) && passwordConsole.equals(password)) {
				System.out.println("Access Granted! Welcome!");
				return true;

			} else if (userConsole.equals(user)) {
				System.out.println("Invalid Password!");
			} else if (passwordConsole.equals(password)) {
				System.out.println("Invalid Username!");
			} else {
				System.out.println("Invalid Username & Password!");
			}
			
			System.out.println("Total attempts: " + count + "/3");
			count++;

			if (count == 4) System.out.println("Account blocked!");
			
		} while (count < 4);
		
		

		return false;
	}

}