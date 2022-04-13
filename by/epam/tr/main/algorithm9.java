package by.epam.tr.main;

import java.util.Scanner;

public class algorithm9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] mas1 = new int[] { 1, 2, 3, 8 };
		int[] mas2 = new int[] { 4, 5, 6, 7 };
		int[] mas3 = new int[mas1.length + mas2.length];

		System.out.println("Enter k:");
		int k = sc.nextInt();
		int j = 0;
		
		for (int i = 0; i < mas3.length; i++) {
			if (i < k) {
				mas3[i] = mas1[i];
			}
			else if (i >= k && i < mas2.length + k) {
					mas3[i] = mas2[j];
				j++;
			}
			else if (i == mas2.length + k) {
				mas3[i] = mas1[k];
				k++;
			}
		}
		for (int i = 0; i < mas3.length; i++)
		System.out.print("[" + mas3[i] + "]");
	}
}
