/*
 * file        : adding two numbers
 * description  : finding sum
 * author       : richard
 * version      :2
 * date         :26/09/23
 */
package javaproject;
import java.util.Scanner;
public class AddtwoNumbers {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter two numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("sum is"+sum);
		
	}

}
