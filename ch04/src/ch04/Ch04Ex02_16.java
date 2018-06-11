package ch04;

import java.util.Scanner;

public class Ch04Ex02_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char ch = 'A';
		int count=0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(ch + " ");
				ch += 1;
			}
			for(int z = 0;z<i;z++) {
				System.out.printf("%d ", count++);
			}
			System.out.println();
		}
	}
}
