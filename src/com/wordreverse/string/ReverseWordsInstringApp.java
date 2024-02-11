package com.wordreverse.string;
import java.util.Scanner;
public class ReverseWordsInstringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sentence=scan.nextLine();
        ReverseWordsInstring.WordReverse(sentence);

	}

}
