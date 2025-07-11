package sub2;

/*	날짜: 2025/07/09
	이름: 최상규
	내용: 자바 메서드 실습하기*/

public class MethodTest {

	public static void main(String[] args) {
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);
		int y4 = f(4);
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);
		System.out.println("y4 : " + y4);
		
		int total1 = sum(1, 10);
		int total2 = sum(1, 100);
		
		System.out.println("total1 : " + total1);
		System.out.println("total2 : " + total2);
	}
	
	public static int f(int x) {
		
		int y = 2 * x + 3;
		
		return y;
	}
	
	public static int sum(int start, int end) {
		
		int total = 0;
		
		for(int k=start; k<=end; k++ ) {
			total += k;
		}
		
		return total;
	}

}
