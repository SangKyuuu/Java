package test4.sub3;

public class Main {

	public static void main(String[] args) {
		MovieTicket t = new MovieTicket("타이타닉", "19:00","A1");
		
		t.printTicketInfo();
		System.out.println("-----------------------");
		
		t.bookTicket();
		System.out.println("-----------------------");
		
		t.printTicketInfo();
		System.out.println("-----------------------");
		
		t.bookTicket();
		System.out.println("-----------------------");
		
		t.cancelBooking();
		System.out.println("-----------------------");
		
		t.printTicketInfo();
		System.out.println("-----------------------");
		
		t.cancelBooking();
		System.out.println("-----------------------");
	}

}
