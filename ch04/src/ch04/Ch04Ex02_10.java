package ch04;

import java.util.Scanner;

public class Ch04Ex02_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;	// 3,5의배수를 제외한 수들의 개수
		for(;;) {
			int i = sc.nextInt();
			if(i==0) {
				break;
			}else if(!(i%3==0 || i%5==0)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
