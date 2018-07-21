package test02;

public class Dog implements Action {
	private String name;
	private int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public void sleep() {
		System.out.println("������ " + this.name + "�� ��ϴ�.");
	}

	@Override
	public void run() {
		System.out.println("������ " + this.name + "�� �ݴϴ�.");
	}

	@Override
	public void walk() {
		System.out.println(this.age + "�� ������ " + this.name + "�� �Ƚ��ϴ�.");
	}

	@Override
	public void wakeUp() {
		// TODO Auto-generated method stub

	}

	@Override
	public void breakUp() {
		// TODO Auto-generated method stub

	}

}
