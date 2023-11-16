package day08;

import java.util.Scanner;

public class Ex03_Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("과목수 입력>>");
		int size = scan.nextInt();
		int[] scores = new int[size];
		//점수 입력
		for(int i = 0; i < scores.length; i++) {
			System.out.print( (i+1)+"번째 과목의 점수>>");
			scores[i] = scan.nextInt();
		}
		//입력된 점수 출력
		for(int i = 0; i < scores.length; i++) {
			System.out.println("scores["+i+"] : " + scores[i]);
		}
		
		//최대값 MAX, 최소값 MIN
//		int[] scores = { 80, 88, 90, 78, 100 };
		int max = scores[0]; // 최대값을 찾아서 저장하기 위한 변수
		int min = scores[0]; // 최소값을 찾아서 저장하기 위한 변수
//		1. max, scores[0]값을 비교 max < scores[0] 이면 :: max = scores[0]
//		2. max, scores[1]값을 비교 max < scores[1] 이면 :: max = scores[1]
//		3. max, scores[2]값을 비교 max < scores[2] 이면 :: max = scores[2]
//		4. max, scores[3]값을 비교 max < scores[3] 이면 :: max = scores[3]
//		5. max, scores[4]값을 비교 max < scores[4] 이면 :: max = scores[4]
		for(int i = 0; i < scores.length; i++) {
			if( max < scores[i] ) {
				max = scores[i];
			}
			if( min > scores[i]) {
				min = scores[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}

}










