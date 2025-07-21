package sub3;
/*
 * 날짜 : 25/07/21
 * 이름 : 최상규
 * 내용 : 자바 예외 발생시키기 실습하기
 * */

class MinusException extends Exception{
	public MinusException(String message) {
		super(message);
	}
}

class OverException extends Exception{
	public OverException(String message) {
		super(message);
	}
}

class Score{
	public void check(int score) throws MinusException, OverException{
		if(score < 0 ) {
			//예외 발생 시키기
			throw new MinusException("점수는 음수가 될 수 없습니다.");
		}else if(score > 100) {
			//예외 발생 시키기
			throw new OverException("100을 초과 할 수 없습니다.");
		}else {
			System.out.println("점수 이상 없습니다.");
		}
		
	}
}

public class ThrowTest {
	public static void main(String[] args) {
		Score s = new Score();
		try {
			//s.check(-3);
			//s.check(120);
			s.check(90);
		} catch (MinusException e) {
			e.printStackTrace();
		} catch (OverException e) {
			e.printStackTrace();
		}
	}
}
