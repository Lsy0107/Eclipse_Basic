package day06;

public class Ex01_for {

	public static void main(String[] args) {
		/* 중첩 for문 */
/*			
		for(초기화식; 조건식; 증감식) {
			반복 실행될 부분
		}
*/	
		for(int i = 0; i <= 2; i++ ) { // i : 0,1,2 : 3번
			System.out.println("[ i = " + i + " ]");
			for(int j = 0; j <= 3; j++) { // j : 0,1,2,3 : 4번
				System.out.println("j = " + j);
			}
		}
		/*
		 구구단 : 2단 ~ 9단
		 2 X 1 = 2,   3 X 1 = 3,  9 X 1 = 9
		 2 X 2 = 4,   3 X 2 = 6,  9 X 2 = 18 
		 2 X 9 = 18,  3 X 9 = 27, 9 X 9 = 81 
		 */
		for(int i = 2; i <= 9; i++) { // 2 ~ 9
			for(int j = 1; j <= 9; j++) { // 1 ~ 9
				System.out.println(i+"X"+j+"="+(i*j));
			}
		}
		
		
	}

}
