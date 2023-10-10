package javaproject;

import java.util.Scanner;


public class Palindrome {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
				System.out.println("enter the string");
		String input=sc.next();
		boolean word = YesPalindrome(input);
		if(word)
		{
			System.out.println("the string is palindrome");
		}
		else
		{
			System.out.println("the string is not palindrome");
	}
}

		static boolean YesPalindrome(String input){
		char[] charArray=input.toCharArray();
		int length=input.length();
		for(int i=0;i<length/2;i++)
		{
		if(charArray[i]!=charArray[length-i-1])
		{
			return false;
		}
		}
			return true;	
	}
		}

