package sub4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * 25/07/25
 * 최상규
 * Transaction 실습하기
 * 
 * */
public class TransactionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("에러를 발생 하시겠습니까?");
		
		int answer = sc.nextInt();
		
		//DB정보
		final String HOST = "jdbc:oracle:thin:@localhost:1521:xe";
		final String USER = "bank";
		final String PASS = "1234";
		
		Connection conn = null;
		PreparedStatement psmt1 = null;
		PreparedStatement psmt2 = null;
		
		try {
			conn = DriverManager.getConnection(HOST, USER, PASS);
			
			//오토커밋 해제
			conn.setAutoCommit(false);
			
			String sql1 = "UPDATE ACCOUNT SET ACC_BALANCE = ACC_BALANCE - 10000 WHERE ACC_CID = ?";
			String sql2 = "UPDATE ACCOUNT SET ACC_BALANCE = ACC_BALANCE - 10000 WHERE ACC_CID = ?";
			
			psmt1 = conn.prepareStatement(sql1);
			psmt2 = conn.prepareStatement(sql2);
			
			psmt1.setString(1, "730423-1000001");
			psmt2.setString(1, "830513-2000003");
			
			psmt1.executeUpdate();
			
			if(answer ==1) {
				throw new Exception("예기치 못한 에러 발생");
			}
			
			psmt2.executeUpdate();
			
			conn.commit(); //트랜젝션 작업 확정(트랜젝션 실행)
			
			//종료
			psmt1.close();
			psmt2.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
