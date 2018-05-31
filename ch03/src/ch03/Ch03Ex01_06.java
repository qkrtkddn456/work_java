package ch03;

import java.util.Scanner;

public class Ch03Ex01_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		int i2 = scanner.nextInt();
		
		boolean b = i == 0 ? false : true;
		boolean b2 = i2 == 0 ? false : true;
		
		System.out.printf("%b %b", b && b2, b || b2);
	}
}
