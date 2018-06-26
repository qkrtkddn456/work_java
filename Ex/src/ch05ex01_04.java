import java.util.Scanner;

public class ch05ex01_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[100];
		int count = 0;
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
			if(nums[i]==0) {
				break;
			}
			count ++;
		}
		for(int i=count-1; i>=0; i--) {
			System.out.print(nums[i] + " ");
		}
	}
}