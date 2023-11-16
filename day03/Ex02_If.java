package day03;

public class Ex02_If {

	public static void main(String[] args) {
/*		if(조건식1) {
			조건식1이 true 일 경우
		} else if(조건식2) {
			조건식1 false 이고,
			조건식2 true 일 경우
		} else if(조건식3) {
			조건식1 false, 조건식2 false,
			조건식3 true 일 경우
		} else {
			조건식1,2,3이 모두 false일 경우
		}    							
*/
		int num = 100;
		System.out.println("if문 시작");
		if( num > 50 ) { //true
			System.out.println("50보다 크다");
		} else if(num > 40) {
			System.out.println("40보다 크다");
		} else if(num > 30) {
			System.out.println("30보다 크다");
		}
		System.out.println("if문 종료");
		
		int num2 = 100;
		if(num2 > 50) {
			System.out.println("50보다 크다");
		}
		if(num2 > 40) {
			System.out.println("40보다 크다");
		}		
		if(num2 > 30) {
			System.out.println("30보다 크다");
		}		
		
		
		
		
		
	}

}














