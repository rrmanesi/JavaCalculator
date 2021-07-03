package com.tts.utility;

import java.util.ArrayList;

public class MagicCalculator extends JavaCalculator{
	 
	 double sin(double num1) {
		 return(Math.sin(Math.toRadians(num1)));
	 }

	 double cosine(double num1) {
		 return(Math.cos(Math.toRadians(num1)));
	 }
	 
	 double tangent(double num1) {
		 return(Math.tan(Math.toRadians(num1)));
	 }
	 
	 double SquareRoot(int num1) {
		 return(Math.sqrt(num1));
	 }
	 
	 ArrayList<Integer> factorial(int num1) {
		 ArrayList<Integer> factNum = new ArrayList<>();
		 for (int i = 1; i <= num1; ++i) {

		      // if number is divided by i
		      // i is the factor
		   if (num1 % i == 0) {
		      factNum.add(i);
		   }
	     }
		 return factNum;
		 
	 }
	 
	 public static void main(String[] args) {
		 
		 MagicCalculator cal = new MagicCalculator();
		 
		System.out.println(cal.add(1,2));
		System.out.println(cal.subtract(8,2));
		System.out.println(cal.multiply(1,2));
		System.out.println(cal.divide(4,2));
		System.out.println(cal.square(4));
		System.out.println(cal.sin(45.0));
		System.out.println(cal.cosine(45.0));
		System.out.println(cal.tangent(45.0));
		System.out.println(cal.SquareRoot(4));
		System.out.println(cal.factorial(8));
	 }
	 
	 
}
