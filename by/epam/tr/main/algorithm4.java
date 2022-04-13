package by.epam.tr.main;

import java.util.Scanner;

public class algorithm4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x <= 2 && x >= -2 && y <= 4 && y >= 0) {
			System.out.println("true");
		} else if (x <= 4 && x >= -4 && y <= 0 && y >= -3) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
