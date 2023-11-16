package day03;

public class Ex03_If {

	public static void main(String[] args) {
		int score = 94;
		String grade;
		if(score >= 90) {
			// 95 ~ 100 : A+ , 90 ~ 94 : A0
			if(score >= 95) {
				//System.out.println("A+입니다.");
				grade = "A+";
			} else {
				//System.out.println("A0입니다.");
				grade = "A0";
			}
		} else if(score >= 80) {
			//System.out.println("B입니다.");
			grade = "B";
		} else if(score >= 70) {
			//System.out.println("C입니다.");
			grade = "C";
		} else {
			//System.out.println("재수강입니다.");
			grade = "재수강";
		}
		System.out.println( grade + "입니다.");
		
		
		

	}

}
