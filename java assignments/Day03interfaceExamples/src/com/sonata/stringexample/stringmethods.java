package com.sonata.stringexample;

public class stringmethods {

	public static void main(String[] args) {
		String name = "Jonathan";
		System.out.println("name: " + name);
		System.out.println("3rd character of name: " + name.charAt(2));
		System.out.println("Jonathan compared to Solomon: " + name.compareTo("Solomon"));
		System.out.println("Solomon compared to Jonathan: " + "Solomon".compareTo("Jonathan"));
		System.out.println("Jonathan compared to jonathan: " + name.compareTo("jonathan"));
		System.out.println("Jonathan compared to jonathan (ignore case): " + name.compareToIgnoreCase("jonathan"));
		System.out.println("Is Jonathan equal to Jonathan? " +name.equals("Jonathan"));
		System.out.println("Is Jonathan equal to jonathan? " + name.equals("jonathan"));
		System.out.println("Is Jonathan equal to jonathan (ignore case)? " + name.equalsIgnoreCase("jonathan"));
		char charArr[] = "Hi XX".toCharArray();
		"Jonathan".getChars(0, 2, charArr, 3);
		System.out.print("getChars method: ");
		System.out.println(charArr);
		System.out.println("Length of name: " + name.length());
		System.out.println("Replace a's with e's in name: " + name.replace('a', 'e'));
		System.out.println("A substring of name: " + name.substring(0, 2));
		System.out.println("Trim \" a b c d e f \": \"" +" a b c d e f ".trim() + "\"");
		System.out.println("String representation of boolean expression 10>10: " + String.valueOf(10>10));
		System.out.println("String representation of boolean expression 10<10: " + (10<10));
		System.out.println("name: " + name);




	}

}
