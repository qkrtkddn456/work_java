package ch05;

import java.util.Scanner;

public class Ch05Ex02_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int sum = 0;	// 합을저장할 변수
		for (int i = 0; i < input.length; i++) {
			if (i % 2 == 0) {	// 첫번째 세번째 다섯번째만 더함
				sum += Integer.parseInt(input[i]);
			}
		}
		System.out.println(sum);
	}
}
