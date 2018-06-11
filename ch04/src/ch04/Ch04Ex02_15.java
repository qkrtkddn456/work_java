package ch04;

import java.util.Scanner;

public class Ch04Ex02_15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int star = sc.nextInt();
		for (int i = 1; i <= star; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("*");
			}
			System.out.println();
		}
		for(int i=star-1; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}
}
