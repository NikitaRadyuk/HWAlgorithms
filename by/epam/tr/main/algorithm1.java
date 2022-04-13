package by.epam.tr.main;

import java.util.Scanner;

public class algorithm1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sum1 = a / 1000 + a % 1000 / 100;
		int sum2 = a % 10 + a % 100 / 10;
		if (sum1 == sum2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}