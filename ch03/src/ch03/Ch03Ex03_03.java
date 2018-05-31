package ch03;

import java.util.Scanner;

public class Ch03Ex03_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();	//3과목 점수 정수로 입력받음
		int i2 = scanner.nextInt();
		int i3 = scanner.nextInt();
		
		double ave = (double)(i + i2 + i3) / 3; //더블형으로 3과목 평균구함
		
		System.out.printf("%.1f", ave);
	}
}
