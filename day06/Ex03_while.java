package day06;

import java.util.Scanner;

public class Ex03_while {

	public static void main(String[] args) {
		/* 반복문 - while*/
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while(run) {
			System.out.print("숫자입력>>");
			int inputNum = scan.nextInt();
			System.out.println("입력한 숫자 : " + inputNum);
//			if(inputNum == 0) {
//				break;
//			}
			switch(inputNum) {
			case 0:
				System.out.println("switch-case");
				run = false;
				break;
			}
		}
		
		
		
	}

}















