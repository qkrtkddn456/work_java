package ch05;

import java.util.Scanner;

public class Ch05Ex02_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[100];
		int max = 0;
		int min = 0;
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = sc.nextInt();
			if(numbers[i]== 999) {
				break;
			}
			else if(numbers[i]>max) {
				max = numbers[i];	// 최대값
			}else if(min == 0) {
				min = numbers[i];	// 처음 최소값
			}else if(numbers[i]<min) {
				min = numbers[i];
			}
		}
		System.out.printf("max : %d\nmin : %d", max, min);
	}
}
