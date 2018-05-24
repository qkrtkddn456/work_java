package ch02;

import java.util.Scanner;

public class M1 {
	public static void main(String[] args)	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("2자리 정수를 입력하세요");
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.printf("10진수: %d\n8진수: %o\n16진수: %x", num, num, num);
	}
}
