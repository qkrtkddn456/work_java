package ch04;

import java.util.Scanner;

public class Ch04Ex01_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float i = sc.nextFloat();
		float i2 = sc.nextFloat();
		if(i>=4.0 && i2>= 4.0) {
			System.out.println("A");
		}else if(i>=3.0 && i2>=3.0) {
			System.out.println("B");
		}else {
			System.out.println("C");
		}
	}
}
