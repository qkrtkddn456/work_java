package ch04;

import java.util.Scanner;

public class Ch04Ex02_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int i = sc.nextInt();
			if(i==-1) {
				break;
			}else if (i%3==0) {
				System.out.println(i/3);
			}
		}
	}
}
