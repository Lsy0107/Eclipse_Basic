package day16;

public class Child extends Parent{
	String childVal;
	
	void childMethod() {
		System.out.println(protectedField);
		System.out.println(defaultField);
		
		System.out.println(childVal);
	}
	
	
	@Override
	void parentMethod() {
		System.out.println("자식클래스에서 재정의된 parentMethod()");
	}
	
	
	
	int testMethod() {
		System.out.println("testMethod() 호출");
		return 1;
	}
	int testMethod(int number) {
		System.out.println("testMethod() 호출");
		return number + 1;
	}
	
	
}






