import java.util.Scanner;

public class ch05ex01_05 {
	public static void main(String[] args) {
		double[] avg = { 85.6, 79.5, 83.1, 80.0, 78.2, 75.0 };
		double sum = 0;
		Scanner sc = new Scanner(System.in);
		String[] ban = sc.nextLine().split(" ");
		int num = Integer.parseInt(ban[0])-1;
		int num2 = Integer.parseInt(ban[1])-1;
		
		for(int i=0; i<avg.length; i++) {
			if(i == num || i == num2) {
				sum += avg[i];
			}
		}
		System.out.println(sum);
	}
}
