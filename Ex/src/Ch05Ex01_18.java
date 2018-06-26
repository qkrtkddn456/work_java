import java.util.Scanner;

public class Ch05Ex01_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] numbers = sc.nextLine().split(" ");
		
		int sum =0;
		int avg = 0;
		int count = 0;
		for(int i=0; i<numbers.length; i++) {
			int num = Integer.parseInt(numbers[i]);
			if(i%2==0) {
				avg += num;
				count++;
			}else {
				sum += num;
			}
		}
		System.out.println("sum :"+ sum);
		System.out.println("avg :"+(float)avg/count);
	}
}
