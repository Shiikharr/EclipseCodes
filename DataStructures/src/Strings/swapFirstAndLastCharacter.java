package Strings;

import java.util.Arrays;

public class swapFirstAndLastCharacter {

//	Java program to swap first and last characters of words in a sentence
//	Write a Java Program to Swap first and last character of words in a Sentence as mentioned in the example?
//
//			Examples:
//
//			Input : geeks for geeks
//			Output :seekg rof seekg
	public static void main(String args[])
	{
		String s="geeks for geeks";
		System.out.println(swap(s));
	}

	private static String swap(String str)
	{
		char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
  
            // k stores index of first character
            // and i is going to store index of last 
            // character. 
            int k = i;
            while (i < ch.length && ch[i] != ' ') 
                i++;
              
            // Swapping
            char temp = ch[k];
            ch[k] = ch[i - 1];
            ch[i - 1] = temp;
  
            // We assume that there is only one space
            // between two words.
        }
        return new String(ch);
	}
}
