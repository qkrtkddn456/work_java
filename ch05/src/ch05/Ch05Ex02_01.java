package ch05;

import java.util.Scanner;

public class Ch05Ex02_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ch = new char[10];
		String[] input = sc.nextLine().split(" ");
		for(int i=0; i<input.length; i++) {
			ch[i] = input[i].charAt(0);
		}
		for(int i=ch.length-1; i>=0; i--) {
			System.out.print(ch[i]+" ");
		}
	}
}
