package day05;

import java.util.Scanner;

public class Ex03_for {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("? ~ ??까지 총합");
		System.out.print("시작할 숫자>>");
		int startNum = scan.nextInt();
		System.out.print("마지막 숫자>>");
		int endNum = scan.nextInt();
		int sum = 0;
		for(int i = startNum; i <= endNum; i++) {
			sum = sum + i;
		}
		System.out.println("총합은 : " + sum);

	}

}





