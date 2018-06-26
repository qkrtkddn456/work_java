import java.util.Scanner;

public class Ch05Ex01_11 {
	public static void main(String[] args) {
		int[] count = new int[10];
		while (true) {
			Scanner sc = new Scanner(System.in);
			int num = Integer.parseInt(sc.nextLine());

			if (num == 0) {
				break;
			}
			int tmp = num / 10;
			count[tmp]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				System.out.printf("%d : %d%n", i, count[i]);
			}
		}
	}
}
