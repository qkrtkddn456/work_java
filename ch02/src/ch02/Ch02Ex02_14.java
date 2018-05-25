package ch02;

import java.util.Scanner;

public class Ch02Ex02_14 {
	public static void main(String[] args) {
		
		System.out.print("yard? ");
		
		Scanner scanner = new Scanner(System.in);
		String n = scanner.nextLine();
		double num = Double.parseDouble(n);
		double cm = num*91.44;
		
		System.out.printf("%.1fyard = %.1fcm",num,cm);
	}
}
