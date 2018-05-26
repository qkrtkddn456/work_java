package ch02;

import java.util.Scanner;

public class Ch02Ex02_04 {
	public static void main(String[] args) {
		System.out.println("입력");
		Scanner scanner = new Scanner(System.in);
		int a = 0;
		int b = 0;
		String num1 = scanner.nextLine();
		String num2 = scanner.nextLine();
		String num3 = scanner.nextLine();
		String num4 = scanner.nextLine();
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		int n3 = Integer.parseInt(num3);
		int n4 = Integer.parseInt(num4);
		a = n1 - n2;
		b = n3 - n4;
		System.out.printf("%d - %d = %d\n",n1,n2,a);
		System.out.printf("%d - %d = %d",n3,n4,b);
		
		
	}

}
