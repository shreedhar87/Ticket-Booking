package jspider;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		TicketImpl ti=new TicketImpl();
		Scanner scan=new Scanner(System.in);
		System.out.println("1.Book tickets\n2.Cancel ticket\n3.Available ticket\n4.Exit\n\nEnter your choice");

		while(true) {
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter number of tickets");
				int add=scan.nextInt();
				ti.bookTicket(add);
				break;
			case 2:
				System.out.println("Enter number of tickets want to cancel");
				int remove=scan.nextInt();
				ti.cancelTicket(remove);
				break;
			case 3:
				ti.viewTicket();
				break;
			case 4:
				System.out.println("Thank you");
				System.exit(0);
				break;
			default:System.out.println(ti.erorr());
			}
		}
	}

}
