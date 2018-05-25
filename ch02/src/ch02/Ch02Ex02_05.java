package ch02;

import java.util.Scanner;

public class Ch02Ex02_05 {
	public static void main(String[] args) {
		System.out.println("입력");
		Scanner scanner = new Scanner(System.in);
		String num = scanner.nextLine();
		String num2 = scanner.nextLine();
		int n = Integer.parseInt(num);
		float n2 = Float.parseFloat(num2);
		
		float mul = n * n2;
		
		System.out.printf("%d * %f = %f", n, n2, mul);
	}
}
