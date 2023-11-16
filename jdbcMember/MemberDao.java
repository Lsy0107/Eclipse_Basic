package jdbcMember;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberDao {
	Connection getConnection() {
		Connection con = null; // 접속 정보 저장
		String url = "jdbc:oracle:thin:@//localhost:1521/xe"; // 접속할 DB 아이피 및 포트
		String userid = "YKD_DBA"; // 접속할 DB의 아이디
		String userpw = "1111"; // 접속할 DB의 비밀번호
		try {
			Class.forName("oracle.jdbc.OracleDriver"); // 드라이버선언 
			con = DriverManager.getConnection(url, userid, userpw);
		} catch (ClassNotFoundException e) { // 드라이버 예외
			e.printStackTrace();
			System.out.println("드라이버 예외");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB 예외");
		} 
		return con;
	}
	
	public void connectClosed(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void pstmtClosed(PreparedStatement pstmt) {
		try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int insert(Member mem) {
		//1. DB접속
		Connection con = getConnection();
		if(con == null) {
			System.out.println("접속 실패");
			return 0;
		} 
		//2. 쿼리문 실행
		String sql = "INSERT INTO MEMBERS(MID, MPW, MNAME, MPHONE, MBIRTH)"
				   + " VALUES(?, ?, ?, ?, ?)";
		int result = 0;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mem.getMid());
			pstmt.setString(2, mem.getMpw());
			pstmt.setString(3, mem.getMname());
			pstmt.setString(4, mem.getMphone());
			pstmt.setString(5, mem.getMbirth());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//3. 결과값 반환
		return result;
	}
	public String select_idCheck(String mid) {
		//1. DB접속
		Connection con = getConnection();
		if(con == null) {
			System.out.println("접속 실패");
			return null;
		} 
		String sql = "SELECT MID FROM MEMBERS"
				   + " WHERE MID = ?";
		String idCheck = null;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mid);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				idCheck = rs.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return idCheck;
	}
	public Member select_login(String inputMid, String inputMpw) {
		//1. DB접속
		Connection con = getConnection();
		if(con == null) {
			System.out.println("접속 실패");
			return null;
		} 
		//2.쿼리문 실행
		String sql = "SELECT * FROM MEMBERS"
				   + " WHERE MID = ? AND MPW = ?";
		Member loginMember = null;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, inputMid);
			pstmt.setString(2, inputMpw);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				loginMember = new Member();
				loginMember.setMid( rs.getString(1) );
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return loginMember;
	}

}






















