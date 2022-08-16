package com.algorithmprograms.bridgelabz;

import java.util.Arrays;

public class Anagram {

	  public static void main(String[] args) {
	        String str1="abcd";
	        String str2="dcba";
	        str1=str1.toLowerCase();
	        str2=str2.toLowerCase();
	        if(str1.length()==str2.length()){
	            char[] charArrays1=str1.toCharArray();
	            char[] charArrays2=str2.toCharArray();
	            Arrays.sort(charArrays1);
	            Arrays.sort(charArrays2);
	            boolean result=Arrays.equals(charArrays1,charArrays2);
	            if(result) {
	                System.out.println(str1 + " and " + str2 + " are anagram.");
	            }
	            else {
	                System.out.println(str1 + " and " + str2 + " are not anagram.");
	            }
	        }
	        else {
	            System.out.println(str1 + " and " + str2 + " are not anagram.");
	        }
	    }
}
