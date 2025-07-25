package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/*
 * 25/07/25
 * 최상규
 * 자바 PreparedStatement 실습하기
 * */
public class PreparedInsertTest {

	public static void main(String[] args) {
		//DB정보
		final String HOST = "jdbc:oracle:thin:@localhost:1521:xe";
		final String USER = "bisunesskyu";
		final String PASS = "1234";
		
		Connection conn = null;
		PreparedStatement ptmt = null;
		
		try {
			//DB접속
			conn = DriverManager.getConnection(HOST, USER, PASS);
			
			//SQL 실행객체 생성(PreparedStatement)
			String sql = "INSERT INTO USER1 VALUES(?,?,?,?)"; // 쿼리 파라미터를 사용한 SQL(준비된 쿼리)
			ptmt = conn.prepareStatement(sql);
			
			// 각 쿼리파라미터를 바인딩
			ptmt.setString(1, "P101");
			ptmt.setString(2, "김유신");
			ptmt.setString(3, "010-4567-1234");
			ptmt.setInt(4, 31);

			//SQL실행
			ptmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
