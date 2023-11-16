package day13;

public class MemberMain {

	public static void main(String[] args) {
		
		boolean run = true;
		MemberService memsvc = new MemberService();
		
		while(run) {
			// 메뉴 출력 기능 메소드 호출
			memsvc.showMenu();
			// 메뉴 선택 
			int selectMenu = memsvc.scan.nextInt();
			switch(selectMenu) {
			case 1: // 회원가입 기능 메소드 호출
				memsvc.memberJoin();
				break;
			case 2: // 로그인 기능 메소드 호출
				break;
			default:
				run = false;
			}
		}
		System.out.println("종료");

	}

}





