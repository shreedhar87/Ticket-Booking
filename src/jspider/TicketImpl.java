package jspider;

public class TicketImpl implements Ticket {
	int ticket=50;
	
	@Override
	public int bookTicket(int a) {
	//	System.out.println("available tickets: "+ticket);

		if(ticket>a) {
			System.out.println(a+" tickets are booked");
			ticket-=a;
		}
		else {
			System.out.println("Not enough ticket");
		}
		return a;
	}

	@Override
	public int cancelTicket(int b) {
		System.out.println(b+" tickets cancel tickets");
		ticket+=b;
		return b;
	}

	@Override
	public int viewTicket() {
		System.out.println("Available tickets are: "+ticket);
		return ticket;
	}

	@Override
	public String erorr() {
		
		return "Invalid ticket";
	}

}
