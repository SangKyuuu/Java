package sub6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 * 25/07/22
 * 최상규
 * 자바 날짜/시간 클래스 실습하기
 * 
 * */
public class DateTest {
	public static void main(String[] args) {
		//Date클래스
		
		Date date = new Date();
		System.out.println("date : " + date); // .toString() 생략
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String result = sdf.format(date);
		System.out.println("result : " + result);
		
		//Calendar 클래스 - 싱글톤
		//Calendar cal = new Calendar();
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int dt = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		System.out.println(year);
		System.out.println(month);
		System.out.println(dt);
		System.out.println(hour);
		System.out.println(min);
		System.out.println(sec);

		System.out.printf("%d-%02d-%02d %02d:%02d:%02d",year,month,dt,hour,min,sec);
	}
}
