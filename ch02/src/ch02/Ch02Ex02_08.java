package ch02;

import java.util.Scanner;

public class Ch02Ex02_08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();
		String n1 = scanner.nextLine();
		String a = scanner.nextLine();
		float num = Float.parseFloat(n);
		float num1 = Float.parseFloat(n1);
		
		System.out.printf("%.2f\n%.2f\n%s",num,num1,a);
	}

}
