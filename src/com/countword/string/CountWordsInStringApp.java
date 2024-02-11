package com.countword.string;
import java.util.Scanner;
public class CountWordsInStringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scan.nextLine();
		CountWordsInString.displayCount(str);

	}

}
