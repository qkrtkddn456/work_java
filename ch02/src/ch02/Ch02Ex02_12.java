package ch02;

import java.util.Scanner;

public class Ch02Ex02_12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		n = scanner.nextInt();
		float n2 = 0;
		n2 = scanner.nextFloat();
		
		System.out.printf("%.2f * %d = %.0f",n2,n,n2*n);
		
	}
}
