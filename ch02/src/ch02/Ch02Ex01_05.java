package ch02;

public class Ch02Ex01_05 {
	public static void main(String[] args) {
		String s = "Seoul";
		String p = "Pusan";
		String i = "Incheon";
		String d = "Daegu";
		String g = "Gwangju";
		String s1 = "10,312,545", s2 = "+91,375";
		String p1 = "3,567,910", p2 = "+5,868";
		String i1 = "2,758,296", i2 = "+64,888";
		String d1 = "2,511,676", d2 = "+17,230";
		String g1 = "1,454,636", g2 = "+29,774";
		System.out.printf("%15s%15s%15s\n", s, s1, s2);
		System.out.printf("%15s%15s%15s\n", p, p1, p2);
		System.out.printf("%15s%15s%15s\n", i, i1, i2);
		System.out.printf("%15s%15s%15s\n", d, d1, d2);
		System.out.printf("%15s%15s%15s", g, g1, g2);
	}
}
