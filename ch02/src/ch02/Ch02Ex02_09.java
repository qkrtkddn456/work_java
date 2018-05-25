package ch02;

import java.util.Scanner;

public class Ch02Ex02_09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n1 = scanner.nextLine();
		String n2 = scanner.nextLine();
		String n3 = scanner.nextLine();
		float a1 = Float.parseFloat(n1);
		float a2 = Float.parseFloat(n2);
		double a3 = Double.parseDouble(n3);
		System.out.printf("%.3f\n%.3f\n%.3f", a1,a2,a3);
	}
}
