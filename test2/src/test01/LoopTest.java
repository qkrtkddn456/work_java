package test01;

public class LoopTest {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			// È¦¼ö ÀÏ¶© È¦¼ö Ãâ·Â
			// Â¦¼öÀÏ¶© Â¦¼ö¶ó°í Ãâ·Â
			if(i%2==0) {
				System.out.println("Â¦¼ö");
			}
			else if(i%2==0){
				System.out.println("Â¦¼ö2");
			}else {
				System.out.println("È¦¼ö");
			}
		}
	}
}
