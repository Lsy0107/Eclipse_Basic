package day11;

public class Ex03_MethodMain {

	public static void main(String[] args) {
		Ex03_Method obj01 = new Ex03_Method();
//		voidMethod() 호출
		obj01.voidMethod();
//		intMethod() 호출
		int result = 0;
//		System.out.println("result : " +result);
		result = obj01.intMethod();
//		System.out.println("result : " +result);

//		obj01의 intVal 값 출력
		System.out.println("intVal : " + obj01.intVal);
//		obj01의 plusOne() 호출
		obj01.plusOne();
		obj01.plusOne();
		obj01.plusOne();
		System.out.println("intVal : " + obj01.intVal);
//		
		System.out.println( obj01.plusTwo()  );
	}

}

















