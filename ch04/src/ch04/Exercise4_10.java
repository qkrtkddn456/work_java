package ch04;

class Exercise4_10 {
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		/*
		 * (1) 알맞은 코드를 넣어 완성하시오.
		 */
		while (num > 0) {
			sum += num % 10;	// 못풀어서 인터넷에 검색했습니다.
			num /= 10;
		}
		System.out.println("sum=" + sum);
	}
}
