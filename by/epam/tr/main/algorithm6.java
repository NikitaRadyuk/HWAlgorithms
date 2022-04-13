package by.epam.tr.main;

import java.util.Scanner;

public class algorithm6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int min;
		int max;

		if (a < b) {
			max = b;
		} else {
			max = a;
		}

		if (c > max) {
			max = c;
		}
//		
		if (a > b) {
			min = b;
		} else {
			min = a;
		}

		if (c < min) {
			min = c;
		}
		
		System.out.println(min + max);
	}
}
