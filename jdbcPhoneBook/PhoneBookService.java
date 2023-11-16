package jdbcPhoneBook;

import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBookService {

	Scanner scan = new Scanner(System.in);
	PhoneBookDao pdao = new PhoneBookDao();

	public void insertPhoneBook() {
		System.out.println("[등록]");
		// 1. 등록할 이름, 전화번호 입력
		System.out.print("등록할 이름 입력>>");
		String name = scan.next();
		System.out.print("등록할 전화번호 입력>>");
		String phonenum = scan.next();
		PhoneBook pb = new PhoneBook();
		pb.setName(name);
		pb.setPhonenum(phonenum);
		// 2. PhoneBookDao insert 기능 메소드 호출
		int insertResult = pdao.insert(pb);
		// 3. 결과 확인 및 처리
		if (insertResult > 0) {
			System.out.println("새 연락처가 등록 되었습니다.");
		} else {
			System.out.println("새 연락처 등록을 실패하였습니다.");
		}
	}

	public void selectPhoneBook() {
		System.out.println("[조회]"); // SELECT * FROM PHONEBOOK
		// 1.PhoneBookDao SELECT 기능 메소드 호출
		// 조회된 연락처 목록 반환
		ArrayList<PhoneBook> pbList = pdao.select();
		if (pbList == null) {
			return;
		}
		// 2. 연락처 목록을 출력
		if (pbList.size() <= 0) {
			System.out.println("등록된 연락처가 없습니다.");
		} else {
			for (int i = 0; i < pbList.size(); i++) {
				System.out.print("이름 : " + pbList.get(i).getName());
				System.out.println(" 전화번호 : " + pbList.get(i).getPhonenum());
			}
		}
	}

	public void selectPhoneBook_Name() { // SELECT * FROM PHONEBOOK WHERE NAME = ?
		// 이름으로 연락처 조회
		System.out.print("검색할 이름 입력>>");
		String inputName = scan.next();
		// 1. PhoneBookDao 기능 메소드 호출
		ArrayList<PhoneBook> pbList = pdao.select_Name(inputName);
		if (pbList == null) {
			return;
		}
		// 2. 조회된 연락처를 출력
		if (pbList.size() <= 0) {
			System.out.println("검색된 연락처가 없습니다.");
		} else {
			for (int i = 0; i < pbList.size(); i++) {
				System.out.print("이름 : " + pbList.get(i).getName());
				System.out.println(" 전화번호 : " + pbList.get(i).getPhonenum());
			}
		}

	}

	public void updatePhoneBook() {
		System.out.println("[수정]");
		// 1. 수정할 연락처를 검색(이름으로 검색)
		System.out.print("검색할 이름 입력>>");
		String inputName = scan.next();
		ArrayList<PhoneBook> pbList = pdao.select_Name(inputName);
		if(pbList == null) {
			return;
		} 
		if(pbList.size() <= 0 ) {
			System.out.println("검색된 연락처가 없습니다.");
		} else {
			System.out.println("연락처가 "+pbList.size()+"개 검색되었습니다.");
			for(int i = 0; i < pbList.size(); i++) {
				System.out.print("["+i+"]이름 : " + pbList.get(i).getName());
				System.out.println(" 전화번호 : " + pbList.get(i).getPhonenum());				
			}
			System.out.print("수정할 연락처 선택>>");
			int selectpb = scan.nextInt();
			PhoneBook pb = pbList.get(selectpb);
			System.out.print("새 전화번호 입력>>");
			String inputPhoneNum = scan.next();
			int result = pdao.update(pb, inputPhoneNum);
			if(result > 0) {
				System.out.println("연락처가 수정 되었습니다.");
			} else {
				System.out.println("연락처가 수정을 실패하였습니다.");
			}
		}

		
		
	}
	public void deletePhoneBook() {
		System.out.println("[삭제]");
		// 1. 삭제할 연락처를 검색(이름으로 검색)
		System.out.print("검색할 이름 입력>>");
		String inputName = scan.next();
		ArrayList<PhoneBook> pbList = pdao.select_Name(inputName);
		if(pbList == null) { // DB접속 문제
			return;
		} 		
		if(pbList.size() <= 0) {
			System.out.println("검색된 연락처가 없습니다.");
		} else {
			System.out.println("연락처가 "+pbList.size()+"개 검색되었습니다.");
			for(int i = 0; i < pbList.size(); i++) {
				System.out.print("["+i+"]이름 : " + pbList.get(i).getName());
				System.out.println(" 전화번호 : " + pbList.get(i).getPhonenum());				
			}			
			System.out.print("삭제할 연락처 선택>>");
			int selectpb = scan.nextInt();
			PhoneBook pb = pbList.get(selectpb);
			int result = pdao.delete(pb);
			if(result > 0) {
				System.out.println("연락처가 삭제 되었습니다.");
			} else {
				System.out.println("연락처 삭제를 실패하였습니다.");
			}
			
		}
		
		
		
	}
}


/*
 * 		1. 삭제할 연락처 검색(이름으로 검색)
 * 
 *      2. 연락처 삭제 처리
 * 		DELETE FROM PHONEBOOK
 *		WHERE NAME = ? AND PHONENUM = ?
 *		
 *		3. 연락처 삭제 결과 출력
 * */









