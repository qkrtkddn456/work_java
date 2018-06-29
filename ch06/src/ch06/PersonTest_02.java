//package ch06;
//
//import java.util.Scanner;
//
//public class PersonTest_02 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		Person[] p = new Person[3];
//		for (int i = 0; i < p.length; i++) {
//			p[i] = new Person();
//			System.out.print("이름:");
//			p[i].name = sc.nextLine();
//			System.out.print("나이:");
//			String tmp = sc.nextLine();
//			p[i].old = Integer.parseInt(tmp);
//			System.out.print("주소:");
//			p[i].add = sc.nextLine();
//		}
//
//		for(int i=0; i<p.length; i++) {
//			p[i].aboutme();
//		}
//	}
//}
