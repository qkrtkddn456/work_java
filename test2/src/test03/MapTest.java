package test03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapTest {

	public static void main(String[] args) {
		LinkedHashMap<String,String> personInfo = 
				new LinkedHashMap<String,String>();
		personInfo.put("�̸�", "ȫ�浿");
		personInfo.put("����","33");
		personInfo.put("�ּ�","����");
		
		System.out.println(personInfo);
		String age= personInfo.get("����");
		System.out.println("personInfo�� ���� : " + age);
		ArrayList<HashMap<String,String>> al = new ArrayList<HashMap<String,String>>();
		
		al.add(personInfo);
		
		
		
	}
}
