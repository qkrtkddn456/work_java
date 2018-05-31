package ch03;

import java.util.Scanner;

public class Ch03Ex01_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		int i2 = scanner.nextInt();
		
		i += 100;
		i2 %= 10;
		
		System.out.printf("%d ",i);
		System.out.print(i2);
	}
}
