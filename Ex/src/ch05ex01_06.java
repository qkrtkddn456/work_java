import java.util.Scanner;

public class ch05ex01_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] numbers = sc.nextLine().split(" ");
		for(int i=0; i<numbers.length; i++ ) {
			int num = Integer.parseInt(numbers[i]);
			
			if(num>= 1000) {
				return;
			}
		}
		
		if (numbers.length != 10) {
			return;
		}
		
		int min = Integer.parseInt(numbers[0]);
		
		for(int i=1; i<numbers.length; i++) {
			int tmp = Integer.parseInt(numbers[i]);
			if(tmp< min) {
				min = tmp;
			}
		}
		System.out.println(min);
	}
}
