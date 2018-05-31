package ch03;

import java.util.Scanner;

public class Ch03Ex01_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		int i2 = scanner.nextInt();
		int i3 = scanner.nextInt();
		
		boolean b = i2 < i && i > i3 ? true : false;
		boolean b2 = i == i2 && i == i3 ? true : false;
		
		System.out.printf("%b %b", b, b2);
		
	}
}
