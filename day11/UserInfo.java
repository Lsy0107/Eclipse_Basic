package day11;

public class UserInfo {
	String userId;
	String userPw;
	String userName;
	String userPhone;
	
	public UserInfo(String userId, String userPw, String userName, String userPhone) {
		super();
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.userPhone = userPhone;
	}

	public boolean loginCheck(String loginId, String loginPw) {
		System.out.println("아이디 비밀번호 확인 기능 호출");
		if( this.userId.equals(loginId) && this.userPw.equals(loginPw) ) {
			System.out.println("로그인 성공");
			return true;
		} else {
			System.out.println("아이디/비밀번호가 일치하지 않습니다.");
			return false;
		}
	}
	public void showInfo() {
		System.out.println("아이디 : " + this.userId);
		System.out.println("비밀번호 : " + this.userPw);
		System.out.println("이름 : " + this.userName);
		System.out.println("전화번호 : " + this.userPhone);
	}

	@Override
	public String toString() {
		return "UserInfo [아이디 : " + userId + ", 비밀번호 : " + userPw + ", userName=" + userName + ", userPhone="
				+ userPhone + "]";
	}
	
}






