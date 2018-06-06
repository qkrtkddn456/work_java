package ch04;

public class Exercise4_4 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=1000; i++) {
			if(!(i%2==0)) {
				System.out.println("+"+i);
				sum += i;
				
			}else {
				System.out.println("(-"+i+")");
				sum =sum-i;
			 }
			if(sum >= 100) {
				break;
			}
		}
		System.out.println(sum);
	}
}
