package test4.sub2;

public class Main {

	public static void main(String[] args) {
		Product p = new Product("P001", "키보드", 35000, 10);
		
		p.printProductInfo();
		System.out.println("--------------------");
		
		p.updatePrice(30000);
		System.out.println("--------------------");
		
		p.printProductInfo();
		System.out.println("--------------------");
		
		p.addStock(5);
		System.out.println("--------------------");
		
		p.printProductInfo();
		System.out.println("--------------------");
	}

}
