package ch03;

public class OperatorEx23 {
	public static void main(String[] args) {
		// Java 메모리 구조 그림을 통해 확인 가능
		String str1 = "abc";	// static 영역
		String str2 = new String("abc");	// heap영역
 
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc" == "abc");	
		System.out.printf(" str1==\"abc\" ? %b%n", str1 == "abc");
		System.out.printf(" str2==\"abc\" ? %b%n", str2 == "abc");	// new는 static 영역이 아닌 heap영역에 저장되어있기 때문에 false
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc")); 	// equals는 변수와 괄호안의 값을 비교함
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n",  	// equalsIgnoreCase는 대소문자 구별안함
				str2.equalsIgnoreCase("ABC"));
	}
}
