package ch03;

import java.util.Scanner;

public class Ch03Ex03_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double d = scanner.nextDouble();	//실수형으로 입력받음
		double d2 = scanner.nextDouble();
		
		double gop = d * d2;	//실수 두수를 곱함
		int i = (int)d *(int)d2;	//두수를 각각 정수로 변환후 곱
		
		System.out.printf("%d %d",(int)gop, i);	//gop을 정수로 변환하여 출력
	}
}
