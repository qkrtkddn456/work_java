package ch04;
public class Exercise4_16gop {
	public static void main(String[] args) {
		a();
		System.out.println();
		System.out.println();
		System.out.println();
		b();
	}
	public static void a() {
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 10; j++) {
				// System.out.print(j + "x" + i + "=" + (j * i) + "\t");
				int x = j + 1 + (i - 1) / 3 * 3;

				int y = i % 3 == 0 ? 3 : i % 3;

				if (x > 9) // 9단까지만 출력한다. 이 코드가 없으면 10단까지 출력된다.
					break;
				System.out.print(x + "*" + y + "=" + x * y + "\t"); //
				// println이아님에 주의
			}
			System.out.println();
			if (i % 3 == 0)
				System.out.println(); //
		}
	}
	public static void b() {
		for (int i = 1; i < 4; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + "x" + i + "=" + (j * i) + "\t");
			}
			System.out.println();
		}
	}
}