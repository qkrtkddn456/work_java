package ch03;

public class Exercise3_1 {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'a'의 문자코드는 65
		
		System.out.println(1 + x << 33);
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++); // x는 3
		System.out.println(x+=2);
		System.out.println( !('A' <= c & c <='Z') );
		System.out.println('C'-c);
		System.out.println('5'-'0');
		System.out.println(c+1);
		System.out.println(++c);	// c는 66
		System.out.println(c++);	// c는 67
		System.out.println(c);		// C 출력
		
//		System.out.printf("%d", (int)'0');
	}
}
