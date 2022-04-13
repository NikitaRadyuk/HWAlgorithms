package by.epam.tr.main;

import java.util.Scanner;

public class algorithm5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
	if (a >= 0) {System.out.println(Math.pow(a, 2));}
	else {System.out.println(Math.pow(a, 4));}
			if (b >= 0) {System.out.println(Math.pow(b, 2));}
			else {System.out.println(Math.pow(b, 4));}
	if (c >= 0) {System.out.println(Math.pow(c, 2));}
	else {System.out.println(Math.pow(c, 4));}
	}
}