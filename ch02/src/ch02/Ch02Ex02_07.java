package ch02;

import java.util.Scanner;

public class Ch02Ex02_07 {
	public static void main(String[] args) {
	System.out.print("height = ");
	Scanner scanner = new Scanner(System.in);
	String height = scanner.nextLine();
	int h = Integer.parseInt(height);
	System.out.printf("Your height is %dcm.", h);
	}
}
