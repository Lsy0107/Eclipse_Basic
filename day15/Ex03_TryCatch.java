package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex03_TryCatch {

	public static void main(String[] args) {
		/* 예외처리 */
		/*
		try {
			실행할 코드
		} catch( 예외상황 ) {
			
		}
		*/
		System.out.println("시작");
		Member[] memArr = new Member[3];
		String mid = null;
		try {
			mid = memArr[0].getMid();//java.lang.NullPointerException
		} catch(NullPointerException e) {
			System.out.println("catch - NullPointerException 예외 발생");
			mid = "te:st";
		}
		System.out.println("회원 아이디 : " + mid);
		System.out.println(  mid.split(":")[0] );
		System.out.println("처리 후 실행");
		System.out.println("종료");
		
		int num = 10;
		try {
			int result = 10 / num;
			System.out.println(result);
			System.out.println(memArr[0].getMid());
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException 예외 발생");
			
		} catch(NullPointerException e) {
			System.out.println("NullPointerException 예외 발생");
			
		} catch(Exception e) {
			System.out.println("Exception 예외 발생");
		}
		
		System.out.println("확인!");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴선택>>");
		int selectMenu = 0 ;
		try {
			selectMenu = scan.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("숫자만 입력 해주세요!");
		} finally {
			System.out.println("무조건 실행");
		}
		System.out.println( selectMenu );
		
		
		
		
		
		
		
	}

}


