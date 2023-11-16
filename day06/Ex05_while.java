package day06;

import java.util.Scanner;

public class Ex05_while {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int totalPrice = 0; // 총 판매금액을 저장하기 위한 변수
		while(true) {
			int coffeePrice = 0;
			System.out.println("[1]아메리카노(2000) [2]바닐라라떼(3500)");
			System.out.print("메뉴선택>>");
			int selectMenu = scan.nextInt();
			switch(selectMenu) { // 선택한 메뉴에 대한 가격 지정
			case 1: // [1]아메리카노를 선택한 경우
				coffeePrice = 2000;
				break;
			case 2: // [2]바닐라라떼를 선택한 경우
				coffeePrice = 3500;
				break;
			}
			System.out.print("돈을 넣어 주세요>>"); // 10000원 입금
			int money = scan.nextInt();
			System.out.println("거스름돈 " + (money - coffeePrice)
					          +"원을 돌려줍니다");
			totalPrice = totalPrice + coffeePrice;
			
			// 커피 총 판매금액이 10000원 이상인경우 종료
			if(totalPrice >= 10000) {
				System.out.println("목표 수익 달성!");
				break;
			}
		}
		System.out.println("총 수익 " + totalPrice + "원");
		System.out.println("while문 종료");
		
		
		
	}

}




























