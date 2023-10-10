/*
 * file        : attendace
 * description  : finding sum
 * author       : richard
 * version      :4
 * date         :26/09/23
 */
package javaproject;
import  java.util.Scanner;
public class Attendance {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your attendance percentage");
		int percentage=sc.nextInt();
		if(percentage<= 100&& percentage>=90)
		{
			System.out.println("attendence mark:10");
		}
		else
		{
			System.out.println("attendance mark:"+((float)percentage/10));
	}
}
}
