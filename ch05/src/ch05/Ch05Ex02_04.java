package ch05;

import java.util.Scanner;

public class Ch05Ex02_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[100];
		String[] input = sc.nextLine().split(" ");
		for(int i=0; i<input.length; i++) {
			numbers[i] = Integer.parseInt(input[i]);
			if(numbers[i] == -1) {
				break;
			}
		}
		for(int i=input.length-4; i<input.length-1; i++) {
			if(i<0) {
				i = 0;
			}
			System.out.print(numbers[i]+ " ");
		}
	}
}
