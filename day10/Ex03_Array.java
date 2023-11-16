package day10;

public class Ex03_Array {

	public static void main(String[] args) {
		String[][] strArr = { { "A","B","C" },
				              { "D", "E" },
				              { "F", "G", "H","I"} };
		//0행의 모든 문자 출력
		System.out.println("0행");
		for(int i = 0; i < strArr[0].length; i++ ) {
			System.out.println(strArr[0][i]);
		}
		
		//1행의 모든 문자 출력
		System.out.println("1행");
		for(int i = 0; i < strArr[1].length; i++ ) {
			System.out.println(strArr[1][i]);
		}
		
		//2행의 모든 문자 출력
		System.out.println("2행");
		for(int i = 0; i < strArr[2].length; i++ ) {
			System.out.println(strArr[2][i]);
		}
		System.out.println();
		for(int row = 0; row < strArr.length; row++) { // 행번호의 반복 0 ~ 2
			System.out.println(row+"행");
			for(int col = 0; col < strArr[row].length; col++) { //열번호의 반복
				System.out.println( strArr[row][col] );
			}
		}
		
		
		
	}

}







