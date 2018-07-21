package test02;

public class Exec2 {
//Dog 클래스를 생성해서
//Action interface 구현하여
// printObject로 정보를 찍어보시기 바래요~
	public static void printObject(Action a) {
		a.sleep();
		a.walk();
		a.run();
	}
	public static void main(String[] args) {
		Person p = new Person("홍길동",33);
		printObject(p);
		
		Cat c = new Cat("동동이",5);
		printObject(c);
		
		Dog d = new Dog("송이", 4);
		printObject(d);
		
	}
}
