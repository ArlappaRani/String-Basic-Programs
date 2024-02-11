package com.duplicates.string;

public class RemoveDuplicates {
	public static String duplicatesremove(String str)
	{
		String newStr="";
		for(int i=0;i<=str.length()-1;i++)
		{
			if(!newStr.contains(str.charAt(i)+""))
			{
				newStr=newStr+str.charAt(i);
			}
		}
		System.out.println(newStr );
		return str;
	}

}
