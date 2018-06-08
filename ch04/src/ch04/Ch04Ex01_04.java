package ch04;

import java.util.Scanner;

public class Ch04Ex01_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float kg = sc.nextFloat();
		if(kg <= 50.8) {	// 체급계산기
			System.out.println("Flyweight");
		}else if(kg <= 61.23) {
			System.out.println("Lightweight");
		}else if(kg <= 72.57) {
			System.out.println("Middleweight");
		}else if(kg <= 88.45) {
			System.out.println("Cruiserweight");
		}else {
			System.out.println("Heavyweight");
		}
	}
}
