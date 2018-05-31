package ch03;

import java.util.Scanner;

public class Ch03Ex03_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double i = scanner.nextDouble();	// 더블형으로 입력받음
		double i2 = scanner.nextDouble();
		double i3 = scanner.nextDouble();
		
		int sum = (int)i + (int)i2 + (int)i3;//각각 인트형으로 변환후 합
		
		
		
		System.out.printf("sum %d\navg %d", sum,//sum을 출력
				(int)((i + i2 + i3) / 3));//실수의 평균을 구한뒤 정수형으로 변환후 출력
	}
}
