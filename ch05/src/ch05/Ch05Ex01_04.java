package ch05;

import java.util.Scanner;

public class Ch05Ex01_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int[] num = new int[100];
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
			if(num[i] == 0) {
				break;
			}
			count++;
		}
		for(int i=count-1; i>=0; i--	) {
			System.out.printf("%d ", num[i]);
		}
	}
}
