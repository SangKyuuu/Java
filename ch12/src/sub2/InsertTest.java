package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*25/07/25
 *최상규 
 *자바 Insert 실습하기
 */

public class InsertTest {

	public static void main(String[] args) {
		//DB정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "bisunesskyu";
		String pass = "1234";
		
		Connection conn = null;
		Statement stmt = null;
		try {
			//데이터베이스 접속
			conn =  DriverManager.getConnection(host, user, pass);
			
			//SQL실행 객체 생성(Statement, PreparedStatement)
			stmt =  conn.createStatement();
			
			//SQL 실행
			String sql = "INSERT INTO USER1 VALUES('J101','김유신','010-1212-2221',31)";
			stmt.executeUpdate(sql);
			
			//결과처리(SELECT문 일 경우)
			
			
		}catch(Exception e) {
			
		}finally {

			try {
				//데이터베이스 종료
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Insert 완료");

	}

}
