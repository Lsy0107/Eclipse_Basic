package day07;

import java.util.Scanner;

public class Ex01_while {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = 0;
		boolean run = true; // while문을 반복수행하기 위한 변수
//		whileLoop:
		while(run) { // while문 시작
			System.out.println("[1]증가 [2]감소 [3]종료"); // 메뉴 출력
			System.out.print("선택>>");
			int selectMenu = scan.nextInt();	// 메뉴 선택
			switch(selectMenu) { //switch 시작
			case 1: // 1번메뉴를 선택한 경우 number값을 1증가
				number++; // number = number + 1;, number += 1;
				break;
			case 2: // 2번메뉴를 선택한 경우
				number--; // number = number - 1;, number -= 1;
				break;
			case 3: // 3번메뉴를 선택한 경우
//				break whileLoop;
				run = false;
				break;
			} // switch 종료
			System.out.println("현재 값은 " + number + "입니다.");
		} // while문 종료
		
	}

}


















