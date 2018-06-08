package ch04;

import java.util.Scanner;

public class Ch04Ex01_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char b = a.charAt(0);
		if(b == 'A') {
			System.out.println("Excellent");
		}else if(b == 'B') {
			System.out.println("Good");
		}else if(b == 'C') {
			System.out.println("Usually");
		}else if(b == 'D') {
			System.out.println("Effort");
		}else if(b == 'F') {
			System.out.println("Fallure");
		}else {
			System.out.println("error");
		}
	}
}
