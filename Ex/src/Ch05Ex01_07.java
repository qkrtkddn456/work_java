import java.util.Scanner;

public class Ch05Ex01_07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] numbers = sc.nextLine().split(" ");

		for (int i = 0; i < numbers.length; i++) {
			int tmp = Integer.parseInt(numbers[i]);

			if (!(1 <= tmp && tmp < 10000)) {
				return;
			}
		}
		int max = 100;
		int min = 100;

		for (int i = 0; i < numbers.length; i++) {
			int num = Integer.parseInt(numbers[i]);
			if (num < 100) {
				if (max == 100) {
					max = num;
				} else {
					max = max < num ? num : max;
				}
			} else {
				if (min == 100) {
					min = num;
				} else {
					min = min > num ? num : min;
				}
			}
		}
		System.out.println(max + " " + min);
	}
}
