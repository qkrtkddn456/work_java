package ch05;

import java.util.Scanner;

public class Ch05Ex02_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[100];
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
			if (numbers[i] == 0) {
				break;
			}
			count++;
		}
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.print(numbers[i] / 2 + " ");
			} else {
				System.out.print(numbers[i] * 2 + " ");
			}
		}
	}
}
