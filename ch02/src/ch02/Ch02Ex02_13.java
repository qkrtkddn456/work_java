package ch02;

import java.util.Scanner;

public class Ch02Ex02_13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c = 0;
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		int d = a + b + c;
		float w= d/3;
		System.out.printf("sum = %d\navg = %.0f", d, w);
		
	}
}
