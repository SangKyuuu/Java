package sub1;
/*
 * 25/07/21  
 * 최상규
 * 자바 Object 클래스 실습하기
 * 
 * */
public class ObjectTest {
	
	public static void main(String[] args) {
		//자바의 모든 클래스는 Object 클래스의 상속 하기 때문에 업캐스팅 가능 
		Object a1 = new Apple("한국", 20000);
		Object a2 = new Apple("일본", 30000);
		
		System.out.println(a1.toString());
		System.out.println(a2);//toString매서드는 datault 매서드 이기 때문에 객체 이름으로 출력 가능
		
		if(a1 == a2) {
			System.out.println("a1과 a2가 같다");
		}else {
			System.out.println("a1과 a2가 다르다");
		}
		
		if(a1.equals(a2)) {
			System.out.println("a1과 a2가 같다");
		}else {
			System.out.println("a1과 a2가 다르다");
		}
	}
	
}
