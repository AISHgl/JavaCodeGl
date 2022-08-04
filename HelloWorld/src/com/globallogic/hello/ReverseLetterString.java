package com.globallogic.hello;
import java.io.*;
import java.util.Scanner;

public class ReverseLetterString {
	  public static void main (String[] args) {
	        
	        String str= "Helloo", nstr="";
	        char ch;
	        
	      System.out.print("Original word: ");
	      System.out.println("Helloo"); //Example word
	        
	      for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); //extracts each character
	        nstr= ch+nstr; 
	      }
	      System.out.println("Reversed word: "+ nstr);
	    }
}
