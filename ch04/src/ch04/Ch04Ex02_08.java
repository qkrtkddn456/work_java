package ch04;

import java.util.Scanner;

public class Ch04Ex02_08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int odd = 0;
		int even = 0;
		for(;;) {
			int i = sc.nextInt();
			if(i==0) {
				break;
			}else if(i%2==0) {
				even ++;
			}else if(!(i%2==0)) {
				odd ++;
			}
		}
		System.out.printf("odd : %d\neven : %d",odd, even);
	}
}
