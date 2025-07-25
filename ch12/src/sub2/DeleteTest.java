package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 25/07/25
 * 최상규
 * 자바 Delete 실습하기
 * */
public class DeleteTest {

	public static void main(String[] args) {
		//DB정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "bisunesskyu";
		String pass = "1234";
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			
			//DB 연결
			conn = DriverManager.getConnection(host, user, pass);
			
			//SQL객체 생성
			stmt = conn.createStatement();
			
			//SQL실행
			String sql = "DELETE FROM USER1 WHERE USER_ID = 'J101'";
			stmt.executeUpdate(sql);
			
			//결과처리(SELECT문 일때)
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//DB연결 종료
				stmt.close();
				conn.close();
				
				System.out.println("Delete 완료");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
