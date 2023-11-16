package day12;

import java.util.Scanner;

public class MemberJoin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 회원정보들을 저장할 배열 (회원 5명)
		MemberInfo[] memList = new MemberInfo[5];
		// 회원가입
		// 1. 가입 정보를 입력받고
		System.out.print("가입할 아이디>>");
		String inputMid = "ykd"; //scan.next();
		System.out.print("가입할 비밀번호>>");
		String inputMpw = "1111";//scan.next();
		System.out.print("가입할 이름>>");
		String inputMname = "양기두"; //scan.next();
		System.out.print("가입할 전화번호>>");
		String inputMphone = "010-4520-3675"; //scan.next();
		
		// 2. 입력된 정보를 MemberInfo의 객체에 저장
/*
		MemberInfo mem01 = new MemberInfo();
		mem01.setMid(inputMid); // mid 필드에 입력한 아이디 저장
		mem01.setMpw(inputMpw);
		mem01.setMname(inputMname);
		mem01.setMphone(inputMphone);
*/	
		MemberInfo mem01 
		 = new MemberInfo(inputMid, inputMpw, inputMname, inputMphone);
		// 3. memList배열에 0번인덱스에 저장
		memList[0] = mem01;
		// 4. memList배열의 0번인덱스에 있는 회원 정보 출력
		System.out.println("아이디 : " + memList[0].getMid() );
		System.out.println("비밀번호 : " + memList[0].getMpw());
		
		
		// 5. 2번회원 가입 >> 가입할 아이디 입력 >> 중복확인
		System.out.print("가입할 아이디>>");
		inputMid = scan.next(); // 
		boolean idCheck = true; //
		for(int i = 0; i < memList.length; i++) {
			if(memList[i] != null) {
				if( inputMid.equals( memList[i].getMid()) ) {
					idCheck = false;
				}
			}
		}
		if(idCheck) {
			System.out.println("사용 가능한 아이디 입니다.");
		} else {
			System.out.println("중복된 아이디 입니다.");
		}
		
		
		
		
		
	}

}


/*
 *   memList
 *  | MemberInfo타입의 obj  |  null  |   |   |   |
 *  getMid();
 * */





