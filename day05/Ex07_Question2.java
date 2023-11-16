package day05;

public class Ex07_Question2 {

	public static void main(String[] args) {
		/*
		 * 1. 1 ~ 30번 까지의 학생
		 * 2. 짝수번 학생, 홀수번 학생
		 * 3. 짝수 : 통새우와퍼세트 9700원
		 *    홀수 : 와퍼세트 8900원
		 *    5의 배수인 학생인 경우 : 와퍼주니어세트 6600원
		 * 4. 통새우와퍼세트 의 총액 출력
		 *    와퍼세트 의 총액 출력
		 *    와퍼주니어세트 총액 출력
		 * */
		int shrimpWafer = 0; // 통새우와퍼 총액
		int wafer = 0; // 와퍼 총액
		int waferJunior = 0; // 와퍼 주니어 총액
		for(int i = 1; i <= 30; i++ ) { // 1 ~ 30번 학생
			if(i % 5 == 0) {
				waferJunior = waferJunior + 6600;
			} else if( i % 2 == 0) { // 짝수번호 학생인 경우
				shrimpWafer = shrimpWafer + 9700;
			} else { // 홀수번호 학생인 경우
				wafer = wafer + 8900;
			}
		}
		System.out.println("통새우와퍼세트 : " + shrimpWafer);
		System.out.println("와퍼세트 : " + wafer);	
		System.out.println("와퍼주니어세트 : " + waferJunior);
		

	}

}





