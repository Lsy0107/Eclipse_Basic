package day11;

public class Ex02_UserMain {

	public static void main(String[] args) {
		String userId01 = "id01";
		String userPw01 = "pw01";
		Ex02_User user01 = new Ex02_User();
		user01.id = userId01;
		user01.pw = userPw01;
		System.out.println("user01의 ID : " + user01.id);
		System.out.println("user01의 PW : " + user01.pw);
		
		String userId02 = "id02";
		String userPw02 = "pw02";
		Ex02_User user02 =  new Ex02_User(userId02, userPw02);
		System.out.println("user02의 ID : " + user02.id);
		System.out.println("user02의 PW : " + user02.pw);
		
		
	}

}















