package ch02;

import java.util.Scanner;

public class Ch02Ex02_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		n1 = scanner.nextInt();	
		n2 = scanner.nextInt();
		System.out.printf("%d + %d = %d", n1,n2,n1+n2);
	}
}
