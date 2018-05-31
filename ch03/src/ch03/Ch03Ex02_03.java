package ch03;

import java.util.Scanner;

public class Ch03Ex02_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		int i2 = scanner.nextInt();
		
		System.out.printf("%d %d\n", ++i, i2--);
		System.out.printf("%d %d", i, i2);
	}
}
