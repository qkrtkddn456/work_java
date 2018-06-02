package ch03;

import java.util.Scanner;

public class Ch03Adv02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("개수입력");
		int sum = sc.nextInt();
		if (sum < 2 || sum >10) {
			System.out.println("구할 갯수를 다시 적으시오");
		}
	}
}
