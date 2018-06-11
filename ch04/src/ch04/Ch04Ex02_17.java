package ch04;

import java.util.Scanner;

public class Ch04Ex02_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++) {
				if(c>=10) {
					System.out.printf("%d",c%10);
					break;
				}
				System.out.printf("%d", c++);
			}
			System.out.println();
		}
	}
}
