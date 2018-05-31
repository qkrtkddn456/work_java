package ch03;

import java.util.Scanner;

public class Ch03Ex02_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		int i2 = scanner.nextInt();
		
		System.out.printf("%d / %d=%d...%d", i, i2,
				i / i2, i % i2);
	}
}
