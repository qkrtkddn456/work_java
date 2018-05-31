package ch03;

import java.util.Scanner;

public class Ch03Ex02_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int m = scanner.nextInt();
		int mkg = scanner.nextInt();
		int g = scanner.nextInt();
		int gkg = scanner.nextInt();
		
		int b = g < m && mkg > gkg ? 1 : 0;
		
		
		
		System.out.printf("%d", b);
	}
}
