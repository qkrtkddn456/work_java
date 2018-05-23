package ch02;

public class VarEx4 {
	public static void main(String[] args) {
		//리터럴의 타입과 접미사
		int octNum = 010;	//8진수 10, 10진수로 8
		int hexNum = 0x10;	//16진수 10, 10진수로 16
		int binNum = 0b10;	//2진수 10, 10진수로 2 (JDK 1.7버전부터 사용가능)
		
		// 숫자 중간에 _(언더바) 는 JDK 1.7버전부터 사용가능
		long big = 100_000_000_000L;		//long big = 100000000000L;
		long hex = 0xffff_ffff_ffff_ffffL;	//long hex = 0xffffffffffffffffL;
		
		float pi = 3.14f;		//접미사 f 대신 F를 사용해도 된다.
		double rate =  1.618d;	//접미사 d 대신 D를 사용해도 되고, 생략해도 된다.
		// float pi = 3.14;		//에러. float타입 변수에 double타입 리터럴 저장불가
		// double rate = 1.618;	//OK. 접미사 d는 생략할 수 있다.
		
		// 타입의 불일치
		int i = 'A';		//OK. 문자 'A'의 유니코드 인 65가 변수 i에 저장된다.
		long L = 123;		//OK. int보다 long타입이 더 범위가 넓다.
		double d = 3.14f;	//OK. float보다 double타입이 더 범위가 넓다.
		//long i1 = 0x123456789;	//에러. int 타입의 범위를 넘는 값을 저장
		float f = 3.14f;			//에러. float 타입보다 double타입의 범위가 넓다.
		byte b = 65;			//OK. byte타입에 저장 가능한 범위의 int 타입 리터럴
		short s = 0x1234;		//OK. short타입에 저장 가능한 범위의 int 타입 리터럴
		
		
	}

}
