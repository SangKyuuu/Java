package sub2;
/*
 * 25/07/21
 * 최상규
 * 자바 String class 실습하기
 * */
public class StringTest {
	public static void main(String[] args) {
		//문자열(문자+배열) 생성
		String str1 = "Hello"; //문자열 literal
		String str2 = new String("Hello");
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		if(str1 == str2) {
			System.out.println("str1, str2 문자열이 같다.");
		}else {
			System.out.println("str1, str2 문자열이 다르다.");
		}
		
		if(str1.equals(str2)) {
			System.out.println("str1, str2 문자열이 같다.");
		}else {
			System.out.println("str1, str2 문자열이 다르다.");
		}
		
		//문자열 길이
		String message = "Hello,Korea";
		System.out.println("길이 : " + message.length());
		//문자열 추출
		
		char c1 = message.charAt(0);
		char c2 = message.charAt(6);
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		
		//문자열 자르기
		String substr1 = message.substring(0, 5); //0부터 5까지
		String substr2 = message.substring(5);    //5부터 마지막까지
		
		System.out.println("substr1 : " + substr1);
		System.out.println("substr2 : " + substr2);
		
		//문자열 인덱스
		int idx1 = message.indexOf('o');
		int idx2 = message.lastIndexOf('o');
		
		System.out.println("idx1 : " + idx1);
		System.out.println("idx2 : " + idx2);
		
		//문자열 분리
		String[] words = message.split(",");
		
		for(String word : words){
			System.out.println(word);
		}
		
		
		//문자열 교체
		String rs1 = message.replace("Korea", "Busan");
		String rs2 = message.replace("Hello", "Welcome");
		
		System.out.println("rs1 : " + rs1);
		System.out.println("rs2 : " + rs2);
		
		//문자열 변환
		int var1 = 1;
		double var2 = 2.1;
		boolean var3 = true;
		
		String s1 = String.valueOf(var1);
		String s2 = var2 + "";
		String s3 = ""+var3; //주로 사용하는 방식
		
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var3 : " + var3);
	}
}
