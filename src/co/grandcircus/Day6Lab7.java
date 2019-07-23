package co.grandcircus;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Day6Lab7 {

	public static void main(String[] args) {
		
		System.out.println("Were going to play a game, Start by entering a name!");
		Scanner scan = new Scanner(System.in);
		System.out.println(" ");
		System.out.println(getName(scan));
		System.out.println(getEmail(scan));
		System.out.println(getPhoneNum(scan));
		System.out.println(getDate(scan));
		
		

	}
	private static String getName(Scanner scan) {
		boolean isTrue = true;
		String choice;
		do {
			System.out.println("Please enter a valid name:");
			choice = scan.nextLine();
			// AtibaFranklin
			if (choice.matches("[A-Za-t]")) {
				isTrue = true;
			} else {
				System.out.println("Sorry, name is not valid!");
			}
			
		} while (!isTrue);
		
		
		return choice;
	}
	
	private static String getEmail(Scanner scan) {
		boolean isTrue = true;
		String choice;
		do {
			System.out.println("Please enter an email:");
			choice = scan.nextLine();
			// 1tibagmailcom
			if (choice.matches(".[a-t]...........")) {
				isTrue = true;
			} else {
				System.out.println("Sorry, Email is not valid!");
			}
			
		} while (!isTrue);
		
		
		return choice;
	}
	private static String getPhoneNum(Scanner scan) {
		boolean isValid = true;
		String input;
		do {
			System.out.println("Please enter a valid phone number. ");
			input = scan.nextLine();
			//313-632-1669
			if (input.matches("[^a-z]")) {
				isValid = true;
			} else {
				System.out.println("Sorry, phone is not valid!");
			}

		} while (!isValid);

		return input;
	}
	private static String getDate(Scanner scan) {
		boolean isCorrect = true;
		String input;
		do {
			System.out.println("Please enter a valid date: ");
			input = scan.nextLine();
				//(09/20/2019)
			if (input.matches("[^a,b,c]")) {
				isCorrect = true;
			} else {
				System.out.println("Sorry, date is not valid date!");
			}

		} while (!isCorrect);

		return input;
	}

}
