package ch04;

import java.util.Scanner;

public class Ch04Ex02_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.print("정수를 입력하세요.(0:종료)>");
			int i = sc.nextInt();
			if(i<0) {
				System.out.println("negative number");
			}else if(i>0) {
				System.out.println("positive integer");
			}else {
				break;
			}
		}
	}
}
