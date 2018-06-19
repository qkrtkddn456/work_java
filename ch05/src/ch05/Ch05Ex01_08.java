package ch05;

import java.util.Scanner;

public class Ch05Ex01_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int sum = 0;
		float avg = 0;
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			int num = Integer.parseInt(input[i]);
			if ((i + 1) % 2 == 0) {
				sum += num;
			} else {
				avg += num;
				count++;
			}
		}
		avg /= count;
		System.out.println("sum:" + sum);
		System.out.printf("avg:%.1f ", avg);

	}

}
