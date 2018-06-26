import java.util.Scanner;

public class Ch05Ex01_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] numbers = sc.nextLine().split(" ");
		int[] num = new int[numbers.length];
		for(int i=0; i<num.length; i++) {
			num[i]=Integer.parseInt(numbers[i]);
		}
		for(int i=0; i<numbers.length-1; i++) {
			boolean changed= false;
			for(int j=0; j<numbers.length-1; j++) {
				if(num[j]>num[j+1]) {
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
					changed = true;
				}
			}
			if(!changed) break;
		}
		for(int i=num.length-1; i>=0; i--) {
			System.out.print(num[i]+" ");
		}
	}
}
