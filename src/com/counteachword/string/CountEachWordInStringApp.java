package com.counteachword.string;
import java.util.Scanner;
public class CountEachWordInStringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String str=scan.nextLine();
		CountEachWordInString.CountWord(str);

	}

}
