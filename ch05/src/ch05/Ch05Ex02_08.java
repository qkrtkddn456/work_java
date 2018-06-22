package ch05;

import java.util.Scanner;

public class Ch05Ex02_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[100];	//100개저장
		int sum = 0;	//5의 배수합계
		int count = 0;	// 5의 배수의 개수
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = sc.nextInt();
			if(numbers[i]==0) {
				break;
			} else if(numbers[i]%5 == 0) {
				sum += numbers[i];
				count ++;
			}
		}
		System.out.println("Multiples of 5 :" + count);
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f" , (float)sum/count);
	}
}
