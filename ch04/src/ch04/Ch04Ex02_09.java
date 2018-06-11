package ch04;

import java.util.Scanner;

public class Ch04Ex02_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int count = 0;	//평균을 구하기위한 카운트
		for(;;) {
			int i = sc.nextInt();
			if(!(0<=i && i<=100)) {
				break;
			}
			sum += i;
			count += 1;
		}
		System.out.printf("sum : %d\navg : %.1f", sum, (float)sum/count);
	}
}
