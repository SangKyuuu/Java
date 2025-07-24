package sub3;
/*
 * 25/07/24
 * 최상규
 * 자바 스레드 동기화 실습하기
 * */
public class ThreadSyncTest {

	public static void main(String[] args) throws InterruptedException {
		Count cnt = new Count();
		
		CountThread c1 = new CountThread(cnt);
		CountThread c2 = new CountThread(cnt);
		CountThread c3 = new CountThread(cnt);
		
		c1.start();
		c2.start();
		c3.start();
		
		c1.join();
		c2.join();
		c3.join();
		
		System.out.println("최종 결과 : " + cnt.getNum());
		
	}

}
