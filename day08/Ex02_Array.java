package day08;

public class Ex02_Array {

	public static void main(String[] args) {
		// 80, 88, 90, 78, 100  scores 
		int[] scores = { 80, 88, 90, 78, 100 };
//		System.out.println(scores[0]);
//		System.out.println(scores[1]);
//		System.out.println(scores[2]);
//		System.out.println(scores[3]);
//		System.out.println(scores[4]);
//		
		for(int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		// scores 배열에 90이 몇번 인덱스에 있는지를 출력
		// 90 >> 95로 변경
		for(int i = 0; i < scores.length; i++) {
			if(scores[i] == 90) {
				System.out.println(i + "번 인덱스");
				scores[i] = 95; 
			}
		}
		// scores 배열의 모든 값을 더한 총점, 평균
		int sum = 0; // 총점
		for(int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		System.out.println("총점 : " + sum);
		double avg = (double)sum / scores.length;
		System.out.println("평균 : " + avg);
		
	}

}









