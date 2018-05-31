package ch03;

import java.util.Scanner;

public class Ch03Ex01_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();
		
		System.out.println(i++);
		System.out.println(++i);
	}
}
