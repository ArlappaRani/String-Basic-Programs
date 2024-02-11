package com.counteachword.string;

public class CountEachWordInString {
	public static void CountWord(String str)
	{
		//converting string into string type of array
		String[]arr=str.split(" ");
		//counting the each word lengths
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Characters present in\" "+arr[i]+"\"is:"+arr[i].length());
		}
	}

}
