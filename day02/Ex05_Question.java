package day02;

import java.util.Scanner;

public class Ex05_Question {
	
	public static void main(String[] args) {
		
		//커피가격
		/*
		 내가 가지고 있는 돈을 입력 받아서
		 커피를 구매 했을 때 남은 잔액 출력 
		 * */
//		import 단축키 : ctrl + shift + o(영문)
		Scanner scan = new Scanner(System.in);
		int coffeePrice = 3000; // 커피 가격
		System.out.print("내가 가지고 있는 돈>>");
		int money = scan.nextInt(); // 내가 갖고 있는 돈 입력
		int result = money - coffeePrice;// 내돈 - 커피값
		if(result >= 0 ) {
			System.out.println("잔액은 "+ result +" 입니다.");
		} else {
			System.out.println("잔액이 부족합니다.");
		}
		
		
	}
	
}






