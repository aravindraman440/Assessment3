package javaprogram;

import java.util.Scanner;

public class CharacterFunction {
public static void main(String[] args) {
	//1st Method using Scanner class
		/*
		 * Scanner scan =new Scanner(System.in);
		 * 
		 * System.out.println("enter the string value"); String str = scan.next();
		 * char[] charArray = str.toCharArray(); for (int i = 0; i < charArray.length;
		 * i++) {
		 * 
		 * System.out.print(charArray[i]+" "); }
		 */
	//2nd Method using for loop
		/*
		 * String str ="Aravind from Karur"; char[] charArray = str.toCharArray(); for
		 * (int i = 0; i < charArray.length; i++) { System.out.print(charArray[i]+" ");
		 * }
		 */
	//3rd Method Using for each loop
		/*
		 * String str="Aravind good bye"; char[] charArray = str.toCharArray(); for
		 * (char c : charArray) { System.out.print(c+" ");
		 * 
		 * }
		 */
	//4th method charAt i of index
	String str="Aravind IT employee";
	char[] charArray = str.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
	char charAt = str.charAt(i);
	System.out.print(charAt+" ");
	}
}



}
