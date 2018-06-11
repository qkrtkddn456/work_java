package ch04;

import java.util.Scanner;

public class Ch04Ex02_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();	// 행, 열
		int y = sc.nextInt();
		for(int i=1; i<=h; i++	) {
			for(int j=1; j<=y; j++) {
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
	}
}
