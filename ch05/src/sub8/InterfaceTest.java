package sub8;

/*	날짜: 25/07/15
	이름: 최상규
	내용: 인터페이스 실습하기
*/

public class InterfaceTest {
	
	public static void main(String[] args) {
		//인터페이스 역할1 - 통일된 표준화 설계
		RemoteControl lg = new RemoteLG();
		lg.powerOn();
		lg.chUp();
		lg.chDown();
		lg.powerOff();
		
		
		RemoteControl ss = new RemoteSamsung();
		ss.powerOn();
		ss.chDown();
		ss.powerOff();
		
		//인터페이스 역할2 - 결합도 완화(유연성)
		Bulb bulb = new Bulb();
		Socket socket = new Power(bulb);
		socket.switchOn();
		socket.switchOff();
		
		//인터페이스 역할3 - 다중 상속 효과
		SmartTv stv = new SmartTv();
		stv.process();
	}	
}
