package test03;

import java.util.ArrayList;
import java.util.Collections;

public class Exec {

	public static void main(String[] args) {
		ArrayList<Person> pList = new ArrayList<Person>();
		for(int i=0; i<5; i++) {
			// 이름은 테스트1~5까지
			// 나이는 10~50까지
			// 포인트는 마음대로
			Person p = new Person();
			p.setName("테스트"+ (i+1));
			p.setAge((i+1)*10);
			pList.add(p);
		}
		for(int i=0; i<5; i++) {
			Person p = pList.get(i);
			System.out.println(p.getName() + " " + p.getAge());
		}
	}
}
