/*file			:	frequency
 * Author		:	Richard m mathew
 * version		:	1.0
 * description	        :	frequency of a given character in a string
 * date			:	03/10/23
 */
package javaproject;

import java.util.Scanner;

public class Frequency {
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String input=sc.nextLine();
		System.out.println("enter the character");
		 char checkme =sc.next().charAt(0);
		int sent =checkFrequency(input,checkme);
		if(sent>0)
		System.out.println("the frequency is"+sent);
		else
			System.out.println("the letter is not present");
	}

		
		static char checkFrequency(String input,char checkme) {
			Scanner sc= new Scanner(System.in);
		char a[]=input.toCharArray();
		char Charcount=0;
		int len=input.length();
		for(int i=0;i<len;i++)
		{
			if(checkme==a[i])
			
				Charcount++;
			
				
	}
		return Charcount;
}
		
}
