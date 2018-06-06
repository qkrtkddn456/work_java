package ch04;

class Exercise4_9 {
	public static void main(String[] args) {
		String str = "12345";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			
			 int j =str.charAt(i)-48;	//1+2+3+4+5=10
			 sum += j;
		}
		System.out.println("sum=" + sum);
	}
}