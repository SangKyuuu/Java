package test2;

/*	날짜: 2025/07/10
	이름: 최상규
	내용: 자바 최대공약수 메서드 연습문제*/

public class Test07 {

	public static void main(String[] args) {
		System.out.println("  1과 5의 최대 공약수 : " + gcd(1, 5));
		System.out.println("  3과 5의 최대 공약수 : " + gcd(3, 6));
		System.out.println(" 12와 5의 최대 공약수 : " + gcd(12, 18));
		System.out.println(" 60과 5의 최대 공약수 : " + gcd(60, 24));
		System.out.println("192와 5의 최대 공약수 : " + gcd(192, 162));
	}
	
	public static int gcd(int a, int b) {
		int temp = 0;
		
		if(a < b) {
			temp = a;
		}else {
			temp = b;
		}
		
		while(true) {
			if(a%temp == 0 && b % temp ==0) {
				break;
			}
			temp --;
		}
		return temp;
	}

}
