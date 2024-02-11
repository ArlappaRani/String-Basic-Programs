package com.analyzecharacters.string;
import java.util.Scanner;
public class AnalyzeCharactersInStringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=scan.nextLine();
		AnalyzeCharactersInString.Displaycount(str);

	}

}
