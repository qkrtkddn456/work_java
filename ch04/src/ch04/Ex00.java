package ch04;

import java.util.Scanner;

public class Ex00 {
	public static void main(String[] args) {
		int num = 0;
		
		System.out.print("*을 출력할 라인의 수를 입력하세요.>");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();		// 화면을 통해 입력받은 내용을 tmp에 저장
		num = Integer.parseInt(tmp);	// 입력받은 문자열(tmp)을 숫자로 변환
		// 행의 수만큼 반복
		for(int i=0; i<num; i++) {
			// 열의 수만큼 반복
			for(int j=0; j<num; j++) {
				// 현재 찍을 곳이 빈칸이 아닌경우
				if (j >= num-i-1) {
					System.out.print("*");
				}
				// 그 외는 빈칸인 경우이므로 빈칸 찍기
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
