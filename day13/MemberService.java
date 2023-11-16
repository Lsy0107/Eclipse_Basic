package day13;

import java.util.Scanner;

public class MemberService {
	/* 기능 정의 클래스 */
	Scanner scan = new Scanner(System.in);
	// 회원 목록 (DB)
	Member[] memberList = new Member[2];
	
	//회원가입 기능 메소드
	public void memberJoin() {
		System.out.println("[회원가입]");
		// memberList 배열의 비어있는 인덱스 검색
		int idx = -1;
		for(int i = 0; i < memberList.length; i++) {
			if(memberList[i] == null) {
				idx = i;
				break;
			}
		}
		if(idx == -1) {
			System.out.println("더이상 회원가입 할 수 없습니다.");
			return;
		}
		//회원가입 처리
		//1. 가입정보 입력받고
		System.out.print("가입할 아이디>>");
		String inputMid = scan.next();
		for(int i = 0; i < memberList.length; i++) {
			if( memberList[i] != null ) {
				if( inputMid.equals( memberList[i].getMid() ) ) {
					System.out.println("중복된 아이디 입니다.\n다시 가입해주세요!");
					return;
				}
			}
		}
		System.out.print("가입할 비밀번호>>");
		String inputMpw = scan.next();
		System.out.print("가입할 이름>>");
		String inputMname = scan.next();		
		//2. 입력된 정보를 하나로 모으고
		Member mem = new Member();
		mem.setMid(inputMid);
		mem.setMpw(inputMpw);
		mem.setMname(inputMname);
		//3. 회원 목록에 저장
		memberList[idx] = mem;
		System.out.println("가입되었습니다.");
	}
	
	//로그인 기능 메소드
	public void memberLogin() {
		System.out.println("[로그인]");
		// 1. 로그인할 아이디, 비밀번호 입력
		System.out.print("아이디입력>>");
		String loginId = scan.next();
		System.out.print("비밀번호입력>>");
		String loginPw = scan.next();
		// 2. 입력한 값과 일치하는 회원정보 검색
		int idx = -1;
		for(int i = 0; i < memberList.length; i++) {
			if( memberList[i] != null ) {
				if( loginId.equals( memberList[i].getMid() ) 
						&& loginPw.equals(memberList[i].getMpw()) ) {
					idx = i;
					break;
				} 
			}
		}
		if(idx > -1) { // 3. 일치하는 회원이 있을 경우 "아이디, 비밀번호, 이름" 출력
			System.out.println("로그인 성공");
			System.out.println( "아이디 : " + memberList[idx].getMid() );
			System.out.println( "비밀번호 : " + memberList[idx].getMpw() );
			System.out.println( "이름 : " + memberList[idx].getMname() );
		} else { //일치하는 회원이 없을 경우 "아이디/비밀번호가 일치하지 않습니다" 출력
			System.out.println("아이디/비밀번호가 일치하지 않습니다");
		}
		
		
		
	}
	
	//메뉴 출력 기능 메소드
	public void showMenu() {
		System.out.println("\n*****************************");
		System.out.println("[1]회원가입 [2]로그인 [3]종료");
		System.out.println("*****************************");
		System.out.print("메뉴선택>>");
	}
	
}








