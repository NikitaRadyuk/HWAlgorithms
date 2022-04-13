package by.epam.tr.main;

import java.util.Scanner;

public class algorithm2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double c = sc.nextDouble();
	
	double frac = (b + Math.sqrt(Math.pow(b,2) + 4*a*c))/(2*a);
	double rez = frac - Math.pow(a, 3) * c + Math.pow(b,-3);
	
	System.out.println(rez);
}
}
