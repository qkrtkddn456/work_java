package ch04;

import java.util.Scanner;

public class Ch04Ex02_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.printf("1.Korea\n2.USA\n3.Japan\n4.China\n");
			System.out.print("number?");
			int i = sc.nextInt();
			if(i==1) {
				System.out.println("\nSeoul\n");
			}else if(i==2) {
				System.out.println("\nWashington\n");
			}else if(i==3) {
				System.out.println("\nTokyo\n");
			}else if(i==4) {
				System.out.println("\nBeijing\n");
			}else {
				System.out.println("\nnone");
				break;
			}
		}
	}
}
