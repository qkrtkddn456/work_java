package ch04;

import java.util.Scanner;

public class Ch04Ex01_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i==0) {
			System.out.println("zero");
		}else if(i>0) {
			System.out.println("plus");
		}else {
			System.out.println("minus");
		}
	}
}
