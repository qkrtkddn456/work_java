package test01;

public class MethodTest {
	String str ="abc";
	
	String test() {
		return "1";
	}
	String test(int a) {
		return "2";
	}
	String test(String a) {
		return "3";
	}
	// ������Ÿ���� String
	// �Լ����� test()
	// 3���� ������ �Լ������� �����
	// ȣ�����ֽø� �˴ϴ�.
	public static void main(String[] args) {
		MethodTest mt1 = new MethodTest();
		MethodTest mt2 = new MethodTest();
		System.out.println(mt1==mt2);
		System.out.println(mt1.str==mt2.str);
		
		System.out.println(mt1.test());
		System.out.println(mt1.test(1));
		System.out.println(mt1.test("a"));
	}
}
