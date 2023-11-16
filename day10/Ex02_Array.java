package day10;

public class Ex02_Array {

	public static void main(String[] args) {
//		String[] strArr = new String[5];
		
		String[][] strArr = new String[2][3];
//		|   A  |      |      |
//		|      |      |      |
		strArr[0][0] = "A";
//		strArr[0][3] = "A"; >> ArrayIndexOutOfBoundsException
		System.out.println(strArr.length);
		System.out.println(strArr[0].length);
		System.out.println(strArr[1].length);
		
		System.out.println("strArr2");
		String[][] strArr2 = new String[3][];
// [0]행
// [1]행
// [2]행
		System.out.println(strArr2.length);
//		System.out.println(strArr2[0].length);
		
		strArr2[0] = new String[2];
		strArr2[1] = new String[5];
		strArr2[1] = new String[3];
		System.out.println(strArr2[0].length);
		System.out.println(strArr2[1].length);
// [0]행 |     |     |
// [1]행 |     |     |     |     |     |
// [2]행 
		
		
	}

}






