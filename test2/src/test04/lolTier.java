package test04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class lolTier {
	
	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> tierList = new ArrayList<HashMap<String,String>>();
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		while(true) {
			if(i==1) {
				System.out.print("계속 입력하려면 1, 종료하려면 나머지 아무키나 누르세요>");
				String input = sc.nextLine();
				i = Integer.parseInt(input);
				if(i!=1	) {
					break;
				}
			}
			System.out.print("닉네임을 입력하세요.>");
			HashMap<String,String> tier = new HashMap<String,String>();
			String input = sc.nextLine();
			tier.put("닉네임", input);
			
			System.out.print("티어를 입력하세요.>");
			input = sc.nextLine();
			tier.put("티어", input);
			
			tierList.add(tier);
			
			i=1;
		}
		
		for(HashMap<String,String> hm:tierList) {
			System.out.println(hm);
		}
	}
}
