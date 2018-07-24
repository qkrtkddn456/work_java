package test04;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest3 {

	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> anyList = new ArrayList<HashMap<String,String>>();
		
		HashMap<String,String> any1 = new HashMap<String,String>();
		any1.put("동물이름", "웰시코기");
		any1.put("나이", "3");
		anyList.add(any1);
		
		HashMap<String,String> any2 = new HashMap<String,String>();
		any2.put("동물이름", "포메라니안");
		any2.put("나이", "5");
		anyList.add(any2);
		
		HashMap<String,String> any3 = new HashMap<String,String>();
		any3.put("동물이름", "푸들");
		any3.put("나이", "1");
		anyList.add(any3);
		
		for(HashMap<String,String> hm:anyList) {
			System.out.println(hm);
		}
	}
}
