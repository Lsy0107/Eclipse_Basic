package day07;

import java.util.Scanner;

public class Ex02_while {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = 0;
		boolean run = true; // while문을 반복수행하기 위한 변수
		while(run) { // while문 시작
			System.out.println("[1]증가 [2]감소 [3]종료"); // 메뉴 출력
			System.out.print("선택>>");
			int selectMenu = scan.nextInt();	// 메뉴 선택
			switch(selectMenu) { //switch 시작
			case 1: // 1번메뉴를 선택한 경우
				System.out.print("증가시킬 값 입력>>");
				int upNum = scan.nextInt();
				number += upNum; // number = number + upNum;
				break;
			case 2: // 2번메뉴를 선택한 경우
				System.out.print("감소시킬 값 입력>>");
				int downNum = scan.nextInt();
				number -= downNum; // number = number - downNum;				
				break;
			case 3: // 3번메뉴를 선택한 경우
				run = false;
				break;
			} // switch 종료
			System.out.println("현재 값은 " + number + "입니다.");
		} // while문 종료

	}
}
