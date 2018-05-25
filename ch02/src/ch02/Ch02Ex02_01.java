package ch02;

import java.util.Scanner;

public class Ch02Ex02_01 {
	public static void main(String[] args) {
		System.out.print("kor, mat, eng를 입력하시오");
		Scanner scanner = new Scanner(System.in);
		String kor = scanner.nextLine();
		String mat = scanner.nextLine();
		String eng = scanner.nextLine();
		int k = Integer.parseInt(kor);
		int m = Integer.parseInt(mat);
		int e = Integer.parseInt(eng);
		int sum = k + m + e;
		int avg = (k + m + e)/3;
		System.out.printf("kor %d\n", k);
		System.out.printf("mat %d\n", m);
		System.out.printf("eng %d\n", e);
		System.out.printf("sum %d\n", sum);
		System.out.printf("avg %d", avg);
		
		
	}
}
