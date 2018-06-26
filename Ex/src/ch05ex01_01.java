import java.util.Scanner;

public class ch05ex01_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split(" ");
		char[] ch = new char[input.length];
		for(int i=0; i<ch.length; i++) {
			ch[i] = input[i].charAt(0);
		}
		System.out.print(ch);
	}
}
