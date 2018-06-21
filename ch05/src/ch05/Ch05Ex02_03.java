package ch05;

import java.util.Scanner;

public class Ch05Ex02_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int sum = 0; // 홀수의 합
		int sum2 = 0; // 짝수의 합
		int tmp = 0; // 정수를 임시저장
		for (int i = 0; i < input.length; i++) {
			tmp = Integer.parseInt(input[i]);
			if (i % 2 == 0) {
				sum += tmp;
			} else {
				sum2 += tmp;
			}
		}
		System.out.println("odd : " + sum);
		System.out.println("even : " + sum2);
	}
}
