package ch03;

import java.util.Scanner;

public class Ch03Adv01 {
	public static void main(String[] args) {
		int chleg = 2, puleg = 4;
		int ch = 0, pu = 0;
		Scanner scanner = new Scanner(System.in);
		for (;;) {
			System.out.println("강아지와 병아리의 합과 다리 입력");
			int sum = scanner.nextInt();
			int leg = scanner.nextInt();
			if (sum == 0 && leg == 0) break;
			if (sum < 0 || sum > 1000 || leg < 0 || leg > 4000) {
				System.out.println("INPUT ERROR");
				continue;
			}
			boolean b = false;
			for(int i=1;i<=sum;i++){
				if(chleg*i+puleg*(sum-i) == leg){ // 2*1 + 4*(25-1) == 80 -> 2 + 96 == 80
					ch = i;
					pu = sum-i;
					b = true;
					System.out.printf("병아리 : %d마리 , 강아지 : %d마리%n", ch,pu);
					break;
				}

			}if(!b) System.out.println("0");
		}
	}
}
