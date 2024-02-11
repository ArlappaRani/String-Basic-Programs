package com.analyzecharacters.string;

public class AnalyzeCharactersInString {
	public static String Displaycount(String str)
	{
	
		//traverse the character array
		int Lowercount=0;
	    int uppercount=0;
	    int numcount=0;
	    int splcount=0;
	    String s1="";
	    String s2="";
	    String s3="";
	    String s4="";
	  
	    
	    
	    for(int i=0;i<=str.length()-1;i++)
	    {
	      if(str.charAt(i)>='a'&& str.charAt(i)<='z')
	      {
	    	  Lowercount++;
	    	  s1+=str.charAt(i);
	    	  
	      }
	      else if(str.charAt(i)>='A'&& str.charAt(i)<='Z')
	      {
	    	  uppercount++;
	    	  s2+=str.charAt(i);
	      }
	      else if(str.charAt(i)>='0'&& str.charAt(i)<='9')
	      {
	    	  numcount++;
	    	  s3+=str.charAt(i);
	      }
	      else
	      {
	    	  splcount++;
	    	  s4+=str.charAt(i);
	      }
	    	
	    }
	    return str;
		
	}
}



