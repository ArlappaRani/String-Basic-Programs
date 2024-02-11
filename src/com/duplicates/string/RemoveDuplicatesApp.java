package com.duplicates.string;
import java.util.Scanner;
public class RemoveDuplicatesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scan.nextLine();
		RemoveDuplicates.duplicatesremove(str);

	}

}
