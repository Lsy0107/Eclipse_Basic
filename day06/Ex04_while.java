package day06;

import java.util.Scanner;

public class Ex04_while {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int coffeeStock = 10; // 커피 재고
		int coffeePrice = 300;// 한잔 가격
		while(true) { // 
			System.out.print("돈을 넣어 주세요>>");
			int money = scan.nextInt();
			// 투입한 금액, 커피 가격 비교 판매 조건 확인
			if( money == coffeePrice ) {
				System.out.println("커피 1잔을 준다.");
				coffeeStock--;
			} else if( money > coffeePrice) {
				System.out.println("커피 1잔을 준다.");
				System.out.println("거스름돈 " + (money - coffeePrice) );
				coffeeStock--;
			} else {
				System.out.println("돈이 부족합니다.");
			}
		
			if( coffeeStock <=0 ) {
				System.out.println("재고 소진");
				break;
			}
		}
		
		

	}

}












