package day12;

public class Ex01_UserMain {

	public static void main(String[] args) {
		Ex01_User user = new Ex01_User();
		user.publicVal = 10;    // 접근가능
//		user.privateVal = 10;   // 접근불가능
		user.protectedVal = 20; // 접근가능
		user.defaultVal = 30;   // 접근가능
		
		
	}

}
