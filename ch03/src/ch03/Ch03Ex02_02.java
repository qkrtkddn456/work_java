package ch03;

import java.util.Scanner;

public class Ch03Ex02_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		int y = scanner.nextInt();

		x += 5;
		y *= 2;
		
		System.out.printf("width = %d\nlength = %d\n"
				+"area = %d", x, y, x * y
				);
	}

}

