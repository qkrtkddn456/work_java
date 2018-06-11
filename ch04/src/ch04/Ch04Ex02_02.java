package ch04;

import java.util.Scanner;

public class Ch04Ex02_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			
		int i = sc.nextInt();
		int j = 0;
		int k = 0;
		while(k<=i) {
			j++;
			k +=j;
		}
		j = 1;
		while(j<=k) {
			System.out.printf("%d ", j);
			j++;
		}
	}
}
