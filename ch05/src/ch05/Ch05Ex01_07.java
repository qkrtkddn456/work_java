package ch05;

import java.util.Scanner;

public class Ch05Ex01_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 10000;
		int max = 1;
		boolean minb = false;
		boolean maxb = false;
		String[] input = sc.nextLine().split(" ");
		for (int i = 0; i < input.length; i++) {
			int num = Integer.parseInt(input[i]);
			if (100 > num) {
				if (max < num) {
					max = num;
					maxb = true;
				}
			} else if (100 < num) {
				if (min > num) {
					min = num;
					minb = true;
				}
			}

		}
		if (minb == false) {
			min = 100;
		}
		if (maxb == false) {
			max = 100;
		}
		System.out.printf("%d %d", max, min);
	}
}
