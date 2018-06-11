package ch04;

import java.util.Scanner;

public class Ch04Ex02_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();	// 곱해질수
		int y = sc.nextInt();	// 곱할수
		for(int i=1; i<=9; i++) {
			for(int j=h; j>=y; j--) {
				System.out.printf("%d * %d =%2d\t", j, i, j*i);
			}
			System.out.println();
		}
	}
}
