package day07;

import java.util.Scanner;

public class Ex05_OrderList2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String orderList = "";   //주문한 메뉴이름들이 저장될 변수
		int totalPrice = 0;		 //결제 금액을 저장할 변수
		int ameCount = 0; 
		int vanilaCount = 0;
		int iceTeaCount = 0;
		
		boolean menuOpen = true; //
		while(menuOpen) { // while문 시작
			System.out.println("[1]아메리카노(2000) [2]바닐라라떼(3500)");
			System.out.println("[3]아이스티(3000) [4]까페라떼 [0]주문종료");
			System.out.print("메뉴선택>>");
			int selectMenu = scan.nextInt();
			switch(selectMenu) { // switch문 시작
			case 1:
				System.out.println("[아메리카노]선택");
				orderList = orderList + "[아메리카노]";
				totalPrice = totalPrice + 2000;
				ameCount++;
				break;
			case 2:
				System.out.println("[바닐라라떼]선택");
				orderList = orderList + "[바닐라라떼]";
				totalPrice = totalPrice + 3500;
				vanilaCount++;
				break;
			case 3:
				System.out.println("[아이스티]선택");
				orderList = orderList + "[아이스티]";
				totalPrice = totalPrice + 3000;
				iceTeaCount++;
				break;
			case 4:
				break;
			case 0:
				System.out.println("[주문종료]");
				menuOpen = false;
				break;
			default:
				System.out.println("잘못 선택 했습니다.\n다시 입력해주세요.");
			}// switch문 종료
		}// while문 종료
		if(totalPrice > 0) {   // 주문내역이 있는 경우
			System.out.print("주문한 메뉴는");
			System.out.print("[아메리카노"+ameCount+"잔]");
			System.out.print("[바닐라라떼"+vanilaCount+"잔]");
			System.out.println("[아이스티"+iceTeaCount+"잔]");
			
			System.out.println("결제 금액은 "+totalPrice+"원입니다.");
			
			
		} else { // 주문내역이 없는 경우
			System.out.println("주문한 메뉴가 없습니다.");
		}
		
		
	}

}






