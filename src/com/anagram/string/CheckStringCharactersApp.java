package com.anagram.string;
import java.util.Scanner;
public class CheckStringCharactersApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first string");
		String str1=scan.nextLine();
		System.out.println("Enter second string");
		String str2=scan.nextLine();
		CheckStringCharacters.Anagram(str1,str2);

	}

}
