package chap001_pjt;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		int best = 0;
		better(best);

	}
	private static void better(int best) {
		int a;
		int b;

		Scanner scanner = new Scanner(System.in);
		System.out.println("a : 숫자입력");
		a = scanner.nextInt();

		System.out.println("b : 숫자입력");
		b = scanner.nextInt();

		if (a > b) {
			best = a;
		} else {
			best = b;
		}
		System.out.println("더 큰 수는 ? :" + best);
	}

}
