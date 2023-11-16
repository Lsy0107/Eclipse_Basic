package day03;

import java.util.Scanner;

public class Ex05_IfQuestion {

	public static void main(String[] args) {
		/*
		1. 커피 메뉴 출력[1]아메리카노(2000) [2]바닐라라떼(3500)
		2. 커피 메뉴 선택
		3. 결제 방법 출력[1]카드결제 [2]현금결제
		4. 결제 방법 선택
		5-1. 카드결제 일 경우 "결제 되었습니다" 출력
		5-2. 현금결제 일 경우
		    - 투입금액입력
		    - 결제 후 남은 잔액 출력 "거스름돈 ??원 입니다."
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("[1]아메리카노(2000) [2]바닐라라떼(3500)"); //메뉴출력
		System.out.print("메뉴선택>>");
		int selectMenu = scan.nextInt(); //2. 메뉴선택
		int coffeePrice = 0; // 커피 가격 변수
		boolean menuCheck = true; // 제시된 번호를 잘 선택했는지
		if(selectMenu == 1) { //커피 가격 결정
			coffeePrice = 2000;
			System.out.println("아메리카노 선택");
		} else if(selectMenu == 2) {
			coffeePrice = 3500;
			System.out.println("바닐라라떼 선택");
		} else { // 다른 번호 입력했을 경우
			System.out.println("잘못된 선택입니다.");
			menuCheck = false;
		}
		
		
		if(menuCheck) {
			System.out.println("[1]카드결제 [2]현금결제"); //3.결제방법출력
			System.out.print("결제방법선택>>");
			selectMenu = scan.nextInt(); //4.결제 방법
			if(selectMenu == 1) { //5-1 카드결제 일 경우
				System.out.println("결제 되었습니다.");
			} else if(selectMenu == 2) { //5-2 현금결제 일 경우
				System.out.print("투입금액입력>>");
				int money = scan.nextInt();
				System.out.println("거스름돈 "+(money - coffeePrice)  +"원 입니다.");
			}
		}
		
		
	}

}




