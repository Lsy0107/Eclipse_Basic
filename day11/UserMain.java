package day11;

import java.util.Scanner;

public class UserMain {
	
	public static void main(String[] args) {
		UserInfo myInfo = new UserInfo("ykd","1111","양기두","010-4520-3675");
		UserInfo test = new UserInfo("test","1111","test","010-4520-3675");
/*		로그인 기능 : 1. 아이디, 비밀번호 입력
 * 					  2. 입력된 아이디, 비밀번호 회원정보와 일치하는지 확인
 * 					  3. 일치하면 "로그인 성공", 
 *                       일치하지 않으면 "아이디/비밀번호가 일치하지 않습니다."
 */
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디입력>>");
		String loginId = scan.next();
		System.out.print("비밀번호입력>>");
		String loginPw = scan.next();	
//		입력된 아이디, 비밀번호 회원정보와 일치하는지 확인
//		확인된 결과값을 반환하는 메소드
		boolean check = myInfo.loginCheck(loginId, loginPw); // check ::일치O = true, 일치X = false;
		if( check ) {
			// 로그인 성공
			// 회원정보 출력 >> myInfo객체의 모든 필드값을 출력
			// myInfo의 showInfo 메소드 호출
			myInfo.showInfo();
			System.out.println( myInfo );
			
		} else {
			// 로그인 실패
			
		}
		
		
	}
	
}



















