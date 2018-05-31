package ch03;

import java.util.Scanner;

public class Ch03Ex01_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			
		int i = scanner.nextInt();
		int i2 = scanner.nextInt();
		
		--i2;
		int j = i * i2;
		i++;
		
		System.out.printf("%d %d %d", i, i2, j);
	}
}
