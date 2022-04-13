package by.epam.tr.main;

import java.util.Scanner;

public class algorithm7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a:");
		double a = sc.nextInt();
		System.out.println("Enter b:");
		double b = sc.nextInt();
		System.out.println("Enter h:");
		double h = sc.nextInt();

		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		for (double x = a; x <= b; x = x + h) {
			double y = Math.pow(Math.sin(x), 2) - Math.cos(2 * x);
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
		}
		System.out.println("---------------------------------");
	}
}
