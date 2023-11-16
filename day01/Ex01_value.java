package day01;

public class Ex01_value {
	//필드
	//메소드
	//생성자
	public static void main(String[] args) {
		/* 변수 */
		/*
		 * 프로그램을 실행하는데 필요한 
		 * 데이터를 저장하기 위해
		 * 메모리 공간안에 영역을 할당하고 
		 * 이름을 부여하는 것
		 */
		// 자료형 : 숫자 || 문자
		// 정수형 숫자 : byte, short, int, long
		int number = 10; // 변수를 선언하고 초기화
		int number2; // int 타입 변수 number2를 선언
		number2 = 20;// number2를 초기화
		
		int number3 = 30;
		int number4;
		System.out.println(number3);
//		System.out.println(number4);
		
//		변수타입 변수명 = 변수값;
		/*
		 [byte 타입] : 1byte >> 8bit
		 [short타입] : 2byte >> 16bit
		 [int  타입] : 4byte
		 [long 타입] : 8byte
		 * */
		byte byteNum1 = 127;
		short shortNum1 = 128;
		int intNum1 = 100;
		long longNum1 = 12345678901L;//(L,l)
		
		//실수형 숫자
		/*
		  [float 타입] : 4byte
 		  [double타입] : 8byte
		 */
		float floatNum1 = 10.123F;
		double doubleNum1 = 111.11234;
		
		//[boolean 타입] : true || false
		boolean boolVal1 = true;
		boolean boolVal2 = false;
		boolean boolVal3 = 10 > 20;
		
		//[char 타입] : 문자
		// ''
		char charVal1 = 'a';
		
		String strVal1 = "abcd";
		
		// int, double, boolean, String
	}

}






