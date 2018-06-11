package ch04;

import java.util.Scanner;

public class Ch04Ex02_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			char ch;	// Y,y일때 작업 반복 아니면 종료
			System.out.print("Base =");
			int Base = sc.nextInt();
			System.out.print("Height =");
			int Height = sc.nextInt();
			System.out.printf("Triangle area = %.1f\n", (float)Base*Height/2);
			System.out.print("Countinue? ");
			ch = sc.next().charAt(0);
			if(!(ch=='Y'||ch=='y')) {
				break;
			}
			
		}
	}
}
