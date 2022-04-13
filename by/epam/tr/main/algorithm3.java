package by.epam.tr.main;

import java.util.Scanner;

public class algorithm3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		
		System.out.println(perimeter(a,b));
		System.out.println(squere(a,b));
	}
	
	public static double perimeter(double a1, double b1) {
		double c = Math.sqrt(Math.pow(a1, 2) + Math.pow(b1, 2));
		double per = a1 + b1 + c;
		return per;
	}
	
	public static double squere(double a1, double b1) {
		double sq = (a1 * b1)/ 2;
		return sq;
	}
}
