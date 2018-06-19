package ch05;

import java.util.Scanner;

public class Ch05Ex01_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split(" ");

		char[] result = new char[s.length];
		for (int i = 0; i < s.length; i++) {
			result[i] = s[i].charAt(0);
			System.out.print(result[i]);
		}
	}
}
/*
 * //1. 문자 10개를 저장하는 배열 Scanner scanner = new Scanner(System.in); String[]
 * alphabets = scanner.nextLine().split(" ");
 * 
 * // 2. 입력받은 문자열 배열을 문자 배열로 변경
 * 
 *
 * //외전 String tmp = scanner.nextLine(); String alphabets = tmp.split(" ");
 */
