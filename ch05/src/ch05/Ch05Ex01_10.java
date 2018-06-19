package ch05;

import java.util.Scanner;

public class Ch05Ex01_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] count = new int[26];
		char[] a = new char[26];
		for (int i = 0;; i++) {
			String input = sc.nextLine();
			char ch = input.charAt(0);
			if (!('A' <= ch && ch <= 'Z')) {
				break;
			} else {
				a[ch - 'A'] = ch;
				count[ch - 'A']++;
			}
		}
		for (int i = 0; i <26; i++) {
			if (count[i] != 0) {
				System.out.println(a[i] + ":" + count[i]);
			}
		}

	}
}
