package ch05;

import java.util.Scanner;

public class Ch05Ex01_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] ave = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		String[] input = sc.nextLine().split(" ");
		int num = Integer.parseInt(input[0]);
		int num2 = Integer.parseInt(input[1]);
		
		double sum = ave[num-1] + ave[num2-1];
		
		System.out.println(sum);
	}
}
