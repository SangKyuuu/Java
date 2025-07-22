package sub1;
/*
 * 25/07/22
 * 최상규
 * 자바 제네릭 실습하기
 * */
public class GenericTest {

	public static void main(String[] args) {
		Apple apple = new Apple("한국", 3000);
		Banana banana = new Banana("대만", 2000);
		
		//FruitBox<Apple> box1 = new FruitBox<Apple>(); 뒤에 생략 가능
		FruitBox<Apple> box1 = new FruitBox();
		box1.setFruit(apple);
		
		FruitBox<Banana> box2 = new FruitBox();
		box2.setFruit(banana);
		
		System.out.println(box1.getFruit());
		System.out.println(box2.getFruit());
	}

}
