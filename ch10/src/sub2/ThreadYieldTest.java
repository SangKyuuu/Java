package sub2;
/*
 * 25/07/24
 * 최상규
 * 자바 스레드 상태 실습하기
 */

class Sub1Thread extends Thread{
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("Sub1 : " + i);

			//스레드 양보하기
			Thread.yield(); 
		}
	}
}

class Sub2Thread extends Thread{
	@Override
	public void run() {
		for(int i=0; i<1000; i++) {

			System.out.println("Sub2 : " + i);

		}
	}

}

public class ThreadYieldTest {

	public static void main(String[] args) throws InterruptedException {
		Sub1Thread s1 = new Sub1Thread();
		Sub2Thread s2 = new Sub2Thread();
		
		s1.start();
		s2.start();
		
		s1.join();
		s2.join();
		
		System.out.println("프로그램 종료");
		
	}

}
