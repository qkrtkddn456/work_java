package ch04;

import java.util.Scanner;

public class Ch04Ex01_02 {	//비만수치 체크
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int ki = sc.nextInt();
		int kg = sc.nextInt();
		int biman = kg+100-ki;
		System.out.println(biman);
		if(biman>0) {
			System.out.println("Obesity");
		}
	}
}
