package day14;

public class PhoneBookMain {

	public static void main(String[] args) {
		PhoneService phoneSvc = new PhoneService();  
		boolean run = true; // while문 제어 변수
		while(run) { // while 시작
			//메뉴출력기능 호출
			phoneSvc.showMenu();
			int selectMenu = phoneSvc.scan.nextInt();
			switch(selectMenu) { //switch 시작
			case 1:
				phoneSvc.registInfo();
				break;
			case 2:
				phoneSvc.searchInfo();
				break;
			case 3:
				phoneSvc.modifyInfo();
				break;
			case 4:
				break;
			default:
				run = false;
			} // switch 종료
		}// while 종료
		System.out.println("종료");
		

	}

}
