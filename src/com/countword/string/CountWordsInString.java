package com.countword.string;

public class CountWordsInString {
	public static String displayCount(String str)
	{
		
		//converting string into string type of array
		String[]arr=str.split(" ");
		System.out.println("The total number of words are:"+arr.length);
		
		//printing the values in the string
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Word "+i+":"+arr[i]);
			
		}
		
		return str;
	}

}
