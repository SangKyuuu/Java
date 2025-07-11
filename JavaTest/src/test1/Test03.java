package test1;

/*	날짜: 2025/07/09
	이름: 최상규
	내용: 자바 연산자 연습문제
*/

public class Test03 {
	public static void main(String[] args) {
		int num = 1;
		int result;
		
		result = num++;
		System.out.println("result : " + result);
		
		result = ++num;
		System.out.println("result : " + result);
		
		result = num--;
		System.out.println("result : " + result);
		
		result = --num;
		System.out.println("result : " + result);
	}
}
