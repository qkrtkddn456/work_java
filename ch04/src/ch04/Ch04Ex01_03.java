package ch04;

import java.util.Scanner;

public class Ch04Ex01_03 {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nai =  sc.nextInt();
		if(nai>=20) {	//20살이하면 몇년후 성인이 되는지
			System.out.println("adult");
		}else {
			System.out.println(20-nai+" years later");
		}
	}
}
