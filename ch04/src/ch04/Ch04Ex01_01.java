package ch04;

import java.util.Scanner;

public class Ch04Ex01_01 {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if (i < 0) {	//정수를 입력받아 음수면 minus출력
			System.out.printf("%d\nminus", i);
		}else {
			System.out.println(i);
		}
	}
}
