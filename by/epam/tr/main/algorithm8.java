package by.epam.tr.main;

import java.util.Scanner;

public class algorithm8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] mas = new int[] {1,4,5,3,642,34,7};
		System.out.println("Enter K:");
		int k = sc.nextInt();
		int sum = 0;
		for(int i = 0;i < mas.length; i++) {
			if (mas[i] % k ==0) {
				 sum = sum + mas[i];
			} 
		}
		System.out.println(sum);
	}
}