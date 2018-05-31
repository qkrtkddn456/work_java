package ch03;

import java.util.Scanner;

public class Ch03Ex01_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		int i2 = scanner.nextInt();
		
		System.out.printf("%b%n", i == i2);
		System.out.printf("%b", i != i2);
	}
}
