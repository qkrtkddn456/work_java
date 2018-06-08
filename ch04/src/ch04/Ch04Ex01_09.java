package ch04;

import java.util.Scanner;

public class Ch04Ex01_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] i = sc.nextLine().split(" ");
		int num = Integer.parseInt(i[0]);
		int num2 = Integer.parseInt(i[1]);
		int num3 = Integer.parseInt(i[2]);
		
		if(num<num2) {
			if(num<num3) {
				System.out.println(num);
			}else {
				System.out.println(num3);
			} 
		}else if(num2<num3) {
			System.out.println(num2);
		}else {
			System.out.println(num3);
		}
	}
}
