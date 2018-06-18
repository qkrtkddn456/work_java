package ch05;

import java.util.Scanner;

public class Ch05Ex01_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = 1000;
		String[] input = sc.nextLine().split(" ");
		for(int i=0; i<input.length; i++) {
			int num = Integer.parseInt(input[i]);
			if(min>num) {
				min = num;
			}
		}
		System.out.println(min);
	}
}
