package test02;

public class ObjectTest3 {
	private int age;
	private String name;
	
	public ObjectTest3(String name, int age) {
		this.age = age;
		this.name = name;
	}
	public String toString() {
		return "�̸� : " + this.name + ", ���� : " + this.age;
	}
	public static void main(String[] args) {
		//�����ڸ� ����ؼ�
		// �̸�: ȫ�浿, ���� : 22
		// �̸�: �̱浿, ���� : 32
		// �̸�: ���浿, ���� : 42
		// ���� ��°��� �������� �ڵ����ּ���.
		ObjectTest3 ot1 = new ObjectTest3("ȫ�浿",22);
		ObjectTest3 ot2 = new ObjectTest3("�̱浿",32);
		ObjectTest3 ot3 = new ObjectTest3("���浿",42);
		
		System.out.println(ot1);
		System.out.println(ot2);
		System.out.println(ot3);
	}
}
