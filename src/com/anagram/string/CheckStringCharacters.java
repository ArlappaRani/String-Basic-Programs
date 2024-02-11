package com.anagram.string;

import java.util.Arrays;

public class CheckStringCharacters {
	public static String Anagram(String str1,String str2)
	{
		//converting  two strings into characters
		char[]arr=str1.toCharArray();
		char[]arr2=str2.toCharArray();
			
		
		//sorting the arrays
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		if(arr==arr2)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("not Anagram");
		}

		
		return str1;
	}

}
