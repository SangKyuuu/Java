package sub3;
/*	날짜: 2025/07/08
	이름: 최상규
	내용: 자바 for 반복문 실습하기
*/
public class ForTest {

	public static void main(String[] args) {
		//for 기본
		for(int i = 0; i < 10; i ++) {
			System.out.println("i : " + i);
		}
		
		
		//1부터 10까지 합
		
		int result = 0;
		for(int i = 1; i <= 10; i++) {
			result += i;
		}
		System.out.println("1부터 10까지 합 : " + result);

		//1부터 10까지 짝수합
		
		result = 0;
		for(int i = 1; i <= 10; i++) {
			if((i%2) == 0) {
				result += i;
			}
		}
		
		System.out.println("1부터 10까지 짝수 합 : " + result);
		
		
		//for 중첩
		
		for(int a=1; a<=3; a++) {
			System.out.println("a : " + a);
			for(int b = 1; b<=5; b++) {
				System.out.println("b : " + b);
			}
		}
		
		//구구단
		
		result = 0;
		for(int x = 2; x < 10; x++) {
			System.out.println(x + "단");
			for(int y = 1; y < 10; y++) {
				result = x * y;
				//System.out.println(x + "x" + y + " = " + result);
				System.out.printf("%d x %d = %d \n", x, y, result);
			}	
		}
		
		//별삼각형
		for(int start = 1; start <= 10; start++) {
			
			for(int end = 10; end > start; end--) {
				System.out.print("☆");
			}
			System.out.print("\n");
		}
		
		
		
	}

}
