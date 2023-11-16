package day02;

public class Ex02_Operator {

	public static void main(String[] args) {
		/* 비교연산자 */
		// >, <, >=, <=, ==, !=
		int number1 = 10;
		int number2 = 20;
		boolean result;
		result = number1 > number2; // false
		System.out.println(number1 + " > " 
						 + number2 + " = " + result );
		
		result = number1 < number2;
		System.out.println(number1 + " < " 
				 + number2 + " = " + result );		
		
		result = number1 >= number2;
		System.out.println(number1 + " >= " 
				 + number2 + " = " + result );		
		
		result = number1 <= number2;
		System.out.println(number1 + " <= " 
				 + number2 + " = " + result );
		
		result = number1 == number2;
		System.out.println(number1 + " == " 
				 + number2 + " = " + result );		
		
		result = number1 != number2;
		System.out.println(number1 + " != " 
				 + number2 + " = " + result );		
		
		/* 논리연산자 */
		/*
		 1. AND ( && ) 
		   : 조건A && 조건B 일때 
		     조건A,조건B가 모두 true 이면 true
		     둘 중에 하나라도 false 이면 false
		 2. OR  ( || )
		   : 조건A || 조건B 일때 
		     조건A,조건B가 모두 false 이면 false
		     둘 중에 하나라도 true 이면 true
		 3. NOT ( ! ) 
		   : A의 값이 true 일 경우 !A 를 사용하면 false
		 * */
		System.out.println("\n논리연산자");
		System.out.println( (10 < 20) && ( 10 < 15 ) );
		System.out.println( (10 < 20) && ( 10 < 5 ) );
//							  true    &&     false
		
		System.out.println("\nOR연산자");
		System.out.println( (10 < 20) || ( 10 < 15 ) );
		System.out.println( (10 < 20) || ( 10 < 5 ) );
		System.out.println( (10 > 20) || ( 10 < 5 ) );
		
		System.out.println("\nNOT연산자");
		boolean boolVal = 10 < 20; // true
		System.out.println(boolVal);
		System.out.println(!boolVal);
	}

}








