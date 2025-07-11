package sub2;

/*
	날짜 : 2025/07/07
	이름 : 최상규
	내용 : 자바 변수 자료형 실습하기

*/

public class DataTypeTest {

	public static void main(String[] args) {
		
		//정수형 
		
		byte  num1 = 127;
		short num2 = 32767;
		char  num3 = 65;
		int   num4 = 2147483647;
		long  num5 = 922_337_283_685_477_507L;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		System.out.println("num5 : " + num5);
		
		//실수형
		
		float  var1 = 0.123456789f;
		double var2 = 0.1234567890123456789;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		
		//논리형
		
		boolean value1 = true;
		boolean value2 = false;
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		
		//문자형
		
		char c1 = 'A';
		char c2 = '가';
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		
		int n1 = c1;
		
		System.out.println("n1 : " + n1);
		
		//문자열
		
		String s1 = "A";
		String s2 = "가";
		String s3 = "Apple";
		String s4 = "가을";
		
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		System.out.println("s3 : " + s3);
		System.out.println("s4 : " + s4);
	}
}
