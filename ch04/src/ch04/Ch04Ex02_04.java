package ch04;

import java.util.Scanner;

public class Ch04Ex02_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		for(;;) {
			count++;
			int i = sc.nextInt();
			sum +=i;
			if(i>=100) {
				break;
			}
		}
		System.out.println(sum);
		System.out.printf("%.1f",(float)sum/count);
	}
}
