package ch05;

import java.util.Scanner;

public class Ch05Ex01_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.nextLine().split(" ");
		
		for(int i=0; i<s.length; i++	) {
			System.out.print(s[i]);
		}
	}
}
