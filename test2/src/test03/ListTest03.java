package test03;

import java.util.ArrayList;
import java.util.Collections;

import org.apache.commons.lang3.StringUtils;

public class ListTest03 {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<String>();
		// (int)(Math.random()*30)+1
		// �ݺ����� ����ؼ� 1~30������ ������ ���ڸ�
		// �� 10���� strList�� �߰��� �ּ���.
		// �׸��� ������ּ���.
		for(int i=1; i<=10; i++) {
			String num = (int)(Math.random()*30)+1 + "";
			num = StringUtils.leftPad(num, 2,'0');
			strList.add(num);
		}
		Collections.sort(strList);

		for(int i=0; i<10; i++) {
			System.out.println(strList.get(i));
		}
	}
}
