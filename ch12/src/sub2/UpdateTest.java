package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 25/07/25
 * 최상규
 * 자바 Update 실습하기
 * */
public class UpdateTest {

	public static void main(String[] args) {
		//DB정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "bisunesskyu";
		String pass = "1234";
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			//데이터베이스 접속
			conn = DriverManager.getConnection(host, user, pass);
			
			//SQL 실행객체 생성
			stmt = conn.createStatement();
			
			//SQL실행
			String sql = "UPDATE USER1 SET AGE = 35 WHERE USER_ID = 'J101'";
			stmt.executeUpdate(sql);
			
			//결과처리(SELECT일때)
			
		}catch(Exception e) {
			
		}finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Update 완료");
	}

}
