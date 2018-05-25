package ch02;

import java.util.Scanner;

public class Ch02Ex02_02 {
	public static void main(String[] args) {
		System.out.println("입력");
		Scanner scanner = new Scanner(System.in);
		String a = scanner.nextLine();
		int a1 = Integer.parseInt(a);
		System.out.printf("%d", a1);
	}
}
