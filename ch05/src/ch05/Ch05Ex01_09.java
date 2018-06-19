package ch05;

import java.util.Scanner;

public class Ch05Ex01_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
//		String[] input = sc.nextLine().split(" ");
		for(int i=0; i<a.length-1; i++) {
			boolean changed = false;	// 자리바꿈체크
			
			for(int j=0; j<a.length-1; j++) {
				if(a[j] < a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					changed = true;
				}
			}
		if (!changed) break;
		}
		for(int i=0; i<a.length; i++) {
			System.out.printf("%d ",a[i]);
		}
	}
}
