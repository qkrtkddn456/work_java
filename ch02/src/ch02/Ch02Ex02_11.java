package ch02;

import java.util.Scanner;

public class Ch02Ex02_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double n = 0;
		double n2 = 0;
		n = scanner.nextDouble();
		n2 = scanner.nextDouble();
		System.out.printf("%10.2f%10.2f%10.2f",n,n2,n+n2);
	}
}
