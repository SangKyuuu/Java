package sub3;
/*
 * 25/07/25
 * 최상규
 * Preared Select 실습하기
 * */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sub2.User1VO;

public class PreparedSelectTest {

	public static void main(String[] args) {
		//DB정보
		final String HOST = "jdbc:oracle:thin:@localhost:1521:xe";
		final String USER = "bisunesskyu";
		final String PASS = "1234";
		
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs= null;
		
		List<User1VO> list = new ArrayList();
		
		try {
			//DB접속
			conn = DriverManager.getConnection(HOST, USER, PASS);
			
			//SQL 실행객체 생성
			String sql = "SELECT * FROM USER1 WHERE AGE>= ?";
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, 20);
			
			//SQL실행
			rs = psmt.executeQuery();
			
			//결과처리
			while(rs.next()) {
				
				//VO객체 생성 : VO객체는 DB에서 조회된 결과로 초기화된 읽기전용 Object(객체)
				User1VO vo = new User1VO();
				
				vo.setUser_id(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				list.add(vo);
			}
			
			for(User1VO user : list) {
				System.out.println(user);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
