package test02;

public class Exec2 {
//Dog Ŭ������ �����ؼ�
//Action interface �����Ͽ�
// printObject�� ������ ���ñ� �ٷ���~
	public static void printObject(Action a) {
		a.sleep();
		a.walk();
		a.run();
	}
	public static void main(String[] args) {
		Person p = new Person("ȫ�浿",33);
		printObject(p);
		
		Cat c = new Cat("������",5);
		printObject(c);
		
		Dog d = new Dog("����", 4);
		printObject(d);
		
	}
}
