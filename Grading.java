
/*
 * file        : grading
 * description  : grade
 * author       : richard
 * version      :3
 * date         :26/09/23
 */
package javaproject;
import  java.util.Scanner;
public class Grading {
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your marks");
		int mark=sc.nextInt();
		if(mark>90 && mark<100) {
			System.out.println("Grade is A");
		}else if(mark>80 && mark<90) {
			System.out.println("Grade is B");
		}else if (mark>70 && mark<80) {
			System.out.println("Grade is c");
		}else if (mark>60 && mark<70) {
			System.out.println("Grade is D");	
		}else if (mark>50 && mark<60) {
			System.out.println("Grade is E");
		}else if (mark>40 && mark<50) {
			System.out.println("Grade is E");
		}
	}

}

