package sub4;

/*	
	날짜: 2025/07/15
	이름: 최상규
	내용: 자바 상속 실습하기
*/

public class InheritTest {

	public static void main(String[] args) {
		
		Sedan sonata = new Sedan("소나타","흰색",0,2000);
		sonata.speedUp(80);
		sonata.turbo();
		sonata.speedDown(20);
		sonata.show();
		
		Truck bongo = new Truck("봉고","남색",0,0);
		bongo.load(100);
		bongo.speedUp(80);
		bongo.speedDown(20);
		bongo.show();
		
		///////////////////////////
		
		StockAccount kb = new StockAccount("KB증권", "101-22-0100", "홍길동", 10000, "삼성전자", 10, 100000);
		kb.deposit(100000);
		kb.withdraw(50000);
		kb.buy(5, 80000);
		kb.show();
		
		kb.sell(5, 90000);
		kb.show();
		
		/////////////////////////////
		Doctor doc = new Doctor("의사",30,"정형");
		doc.work();
		
		Engineer en = new Engineer("엔지니어",20,"자동차");
		en.work();
	}

}
