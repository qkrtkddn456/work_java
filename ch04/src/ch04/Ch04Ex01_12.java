package ch04;

import java.util.Scanner;

public class Ch04Ex01_12 {
	public static void main(String[] args) {	//윤년계산기
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i % 400 == 0 || i % 4 == 0 && i % 100 != 0) {
			System.out.println("leap year");
		}else {
			System.out.println("common year");
		}
	}
}
