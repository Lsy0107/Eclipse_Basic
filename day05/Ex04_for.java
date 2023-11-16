package day05;

public class Ex04_for {

	public static void main(String[] args) {
		for(int i = 1; i < 11; i++) {
			//break; continue;
			// i 가 5이면 중지
			if( i == 5) {
				break;
			}
			System.out.println(" i = " + i );
		}
		System.out.println();
		for(int i = 1; i < 11; i++) {
			System.out.println(" i = " + i );

			if( i == 5) {
				System.out.println("continue");
				continue;
			}
		}

	}

}
