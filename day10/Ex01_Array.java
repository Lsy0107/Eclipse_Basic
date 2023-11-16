package day10;

public class Ex01_Array {

	public static void main(String[] args) {
		/* 2차원 배열 */
		
		int[] numbers = { 11, 12, 13 };
//		크기가 3인 배열
//  idx    [0]    [1]    [2]  
//		|  11  |  12  |  13  |
		System.out.println(numbers[0]);
		
		System.out.println("2차원");
//  idx    [0]    [1]    [2]  
//		|  11  |  12  |  13  |	>> 행, 열
//		|  14  |  15  |  16  |		
//		|  17  |  18  |  19  |		
		int[][] scores = { {11, 12, 13}, 
						   {14, 15, 16}, 
						   {17, 18, 19} };
		System.out.println(scores[0][0]);
		System.out.println(scores[1][1]);
		
		int[][] scores2 = { { 1, 2, 3 }, 
				            { 4, 5, 6, 7, 8 }, 
				            { 9, 10 } };		
	//  idx    [0]    [1]    [2]  
//			|   1  |   2  |   3  |	
//			|   4  |   5  |   6  |   7  |   8  |   		
//			|   9  |  10  |
		System.out.println("scores2");
		System.out.println( scores2[0][0] );
		System.out.println( scores2[0][1] );
		System.out.println( scores2[0][2] );
//		System.out.println( scores2[0][3] );
		
		System.out.println("행의 개수 : " + scores2.length);
		System.out.println("0행의 크기 : " + scores2[0].length);
		System.out.println("1행의 크기 : " + scores2[1].length);		
		System.out.println("2행의 크기 : " + scores2[2].length);	
		
		
		
		
		
	}

}






