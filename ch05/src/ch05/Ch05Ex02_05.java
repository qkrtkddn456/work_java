package ch05;

import java.util.Scanner;

public class Ch05Ex02_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		String[] input = sc.nextLine().split(" ");
		for(int i=0; i<input.length; i++) {
			sum += Double.parseDouble(input[i]);
		}
		System.out.printf("%.1f", sum/input.length);
	}
}
