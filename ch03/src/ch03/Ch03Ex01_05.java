package ch03;

import java.util.Scanner;

public class Ch03Ex01_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		int i2 = scanner.nextInt();
		
		System.out.printf("%d > %d --- %b%n", i, i2, i > i2);
		System.out.printf("%d < %d --- %b%n", i, i2, i < i2);
		System.out.printf("%d >= %d --- %b%n",i, i2, i >= i2);
		System.out.printf("%d <= %d --- %b%n",i, i2, i <= i2);

	}
}
