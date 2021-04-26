package wordsoperations;

import java.util.Scanner;

public class Init {
	private static Scanner reader;

	//scope #1
	public static void main(String[] args) {

		reader = new Scanner (System.in);
		System.out.println("Write some string ...");
		String word = reader.nextLine();
		
		//Operations.print(word);
		//Operations.linebreak();
		Operations.printString(word);
		//Operations.printStringH(word);
		Operations.printStringH(word);
		Operations.printStringV(word);
		Operations.printStringHDash(word);
		Operations.printStringVOffset(word);
		Operations.printStringDiagonal(word);
		
		
		//System.out.println("\nBye bye my friend...");
		
		
		
	}

}
