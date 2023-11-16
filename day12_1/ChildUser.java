package day12_1;

import day12.Ex01_User;

public class ChildUser extends Ex01_User{
	void testMethod() {
		System.out.println( publicVal );
		System.out.println( privateVal );
		System.out.println( defaultVal );
		System.out.println( protectedVal );
	}
}
