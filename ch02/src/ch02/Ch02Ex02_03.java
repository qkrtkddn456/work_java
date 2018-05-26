package ch02;

import java.util.Scanner;

public class Ch02Ex02_03 {
	public static void main(String[] args) {
		System.out.println("입력");
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		String b = scanner.nextLine();
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		System.out.printf("%d\n%d", a1, b1);
	}
}
