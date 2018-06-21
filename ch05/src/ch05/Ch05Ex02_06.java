package ch05;

import java.util.Scanner;

public class Ch05Ex02_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = { 'A', 'P', 'P', 'L', 'E', '!' };
		int count = 0;
		char input = sc.next().charAt(0);
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == input) {
				System.out.println(count);
			} else {
				count++;
			}
			if (count >= ch.length) {
				System.out.println("none");
			}
		}

	}
}
