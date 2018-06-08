package ch04;

import java.util.Scanner;

public class Ch04Ex01_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		int num = Integer.parseInt(input[0]);
		int num2 = Integer.parseInt(input[1]);
		
		if(num>num2) {
			System.out.println(num-num2);
		}else {
			System.out.println(num2-num);
		}
	}
}
