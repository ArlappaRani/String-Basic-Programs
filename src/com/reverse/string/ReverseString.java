package com.reverse.string;

public class ReverseString {
	public static String StringReverse(String str)
	{
		//creating a new  empty string 
		String newstr="";
		//splitting a string
		String []arr=str.split(" ");
		//loop for storing string elements
		for(int i=arr.length-1;i>=0;i--)
		{
			newstr=newstr+arr[i]+" ";
		}
	return newstr;
		
	
	}

}
