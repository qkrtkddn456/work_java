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
		System.out.println("강아지 " + this.name + "가 잡니다.");
	}

	@Override
	public void run() {
		System.out.println("강아지 " + this.name + "가 뜁니다.");
	}

	@Override
	public void walk() {
		System.out.println(this.age + "살 강아지 " + this.name + "가 걷습니다.");
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
