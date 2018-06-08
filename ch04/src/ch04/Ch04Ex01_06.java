package ch04;

import java.util.Scanner;

public class Ch04Ex01_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		char g = input[0].charAt(0);
		int n = Integer.parseInt(input[1]);
		if(g == 'M') {
			if(n>=18) {
				System.out.println("MAN");
			}else {
				System.out.println("BOY");
			}
		}else if(g =='F' && n>=18) {
			System.out.println("WOMAN");
		}else {
			System.out.println("GIRL");
		}
		
		
		
	}
}
