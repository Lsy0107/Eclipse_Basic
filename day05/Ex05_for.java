package day05;

import java.util.Scanner;

public class Ex05_for {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("시작숫자>>");
		int startNum = scan.nextInt();
		System.out.print("종료숫자>>");
		int endNum = scan.nextInt();
		int sum = 0; // 총합을 저장할 변수
		System.out.println("for문 시작");
		for(int i = startNum; i <= endNum; i++) {
			System.out.print(i+" ");
			if( i % 3 != 0) {// 3의 배수인 경우의 합
				continue;
			}
			sum = sum + i;
		}
		System.out.println("\nfor문 종료");
		System.out.println("sum : " + sum);
		
	}

}







