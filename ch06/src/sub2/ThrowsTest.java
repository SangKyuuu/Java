package sub2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsTest {
	public static void main(String[] args) {
		try {
			method1(7);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
	
	public static void method1(int n) throws Exception { //모든 예외처리 상위 클래스 Exception으로 선언 
		method2(n);
	}
	
	//Exception을 method2를 호출한 곳에서 예외처리
	public static void method2(int n) throws InputMismatchException, ArithmeticException{
		Scanner sc = new Scanner(System.in);
		System.out.print("값입력 : ");
		
		int value = sc.nextInt();
		
		int result = n/value;
		
		System.out.println("result : " + result);
		
	}
}
