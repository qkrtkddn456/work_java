package test01;

public class LoopTest {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			// Ȧ�� �϶� Ȧ�� ���
			// ¦���϶� ¦����� ���
			if(i%2==0) {
				System.out.println("¦��");
			}
			else if(i%2==0){
				System.out.println("¦��2");
			}else {
				System.out.println("Ȧ��");
			}
		}
	}
}
