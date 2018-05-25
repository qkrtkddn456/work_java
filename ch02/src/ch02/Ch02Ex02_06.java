package ch02;

import java.util.Scanner;

public class Ch02Ex02_06 {
	public static void main(String[] args) {
		System.out.println("입력");
		Scanner scanner = new Scanner(System.in);
		String num = scanner.nextLine();
		String num2 = scanner.nextLine();
		float n1 = Float.parseFloat(num);
		float n2 = Float.parseFloat(num2);
		System.out.printf("%4.1fyd = %5.1fcm\n", n1, n1*91.44);
		System.out.printf("%4.1fin = %5.1fcm\n", n2, n2*2.54);
	}
}
