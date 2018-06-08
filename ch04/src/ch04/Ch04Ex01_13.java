package ch04;

import java.util.Scanner;

public class Ch04Ex01_13 {
	public static void main(String[] args) {
		System.out.print("번호를 입력하세요.>");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i ==1) {
			System.out.println("dog");
		}else if(i == 2) {
			System.out.println("cat");
		}else if (i ==3) {
			System.out.println("chick");
		}else {
			System.out.println("i don't know.");
		}
	}
}
