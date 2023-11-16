package day09;

import java.util.Scanner;

public class Ex01_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] menuList = {"아메리카노", "바닐라라떼","아이스티"};
		int[] priceList = { 2000, 3500, 3000 };
		int totalPrice = 0;
		int size = menuList.length;
		int[] orderCount = new int[ menuList.length ]; 
		while(true) { // while문 시작
			//menuList 배열의 모든 값 출력
			for(int i = 0; i < menuList.length; i++) {
				System.out.print("["+(i)+"]"+menuList[i] + " ");
			}
			System.out.print("["+menuList.length+"]주문종료");
			System.out.print("\n메뉴선택>>");
			int selectMenu = scan.nextInt(); // menuList[]의 인덱스 번호 입력
			if( selectMenu >= 0 && selectMenu < menuList.length ) {
				System.out.println("["+menuList[selectMenu]+"]선택");
				System.out.println(priceList[selectMenu]+"원 입니다.");
				totalPrice = totalPrice + priceList[selectMenu];
				//선택한 메뉴의 주문수 + 1
				orderCount[selectMenu] = orderCount[selectMenu] + 1;
				
			} else if(selectMenu == menuList.length) {
				System.out.println("[주문종료]선택");
				break;
			} else {
				System.out.println("다시 선택 해주세요!");
			}
		} // while문 종료
		// 주문내역, 총액
		int totalPrice2 = 0;
		for(int i = 0; i < menuList.length; i++) {
			if(orderCount[i] > 0) {
				System.out.println("["+menuList[i]+"]"+orderCount[i]+"잔");
				totalPrice2 = totalPrice2 + ( priceList[i] * orderCount[i] );
			}
		}
		System.out.println("결제할 금액은 " + totalPrice+"원 입니다.");
		System.out.println("결제할 금액은 " + totalPrice2+"원 입니다.");
		
		
		
	}

}







