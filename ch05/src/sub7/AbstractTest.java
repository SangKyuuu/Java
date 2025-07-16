package sub7;

/*	날짜: 2025/07/16
	이름: 최상규
	내용: 추상클래스 실습하기
*/

public class AbstractTest {

	public static void main(String[] args) {
		//Animal animal = new Animal(); - 추상클래스는 객체생성 불가.
		Tiger t = new Tiger();
		Eagle e = new Eagle();
		
		t.move();
		e.move();
		
		t.hunt();
		e.hunt();
	}

}
