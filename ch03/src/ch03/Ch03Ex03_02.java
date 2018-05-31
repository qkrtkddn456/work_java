package ch03;

import java.util.Scanner;

public class Ch03Ex03_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i = scanner.nextInt();	//정수로 입력받음
		int i2 = scanner.nextInt();
		
		
		
		System.out.printf("%d %.2f", i / i2, //첫번째수를 두번째수로 나눈몫
				(double)i / i2); //첫번쨰수를 실수로 변환후 두번째수로 나눔
		//%.2f는 소수점 둘째자리까지 반올림하여 출력

	}
}
