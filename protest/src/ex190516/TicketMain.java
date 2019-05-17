package ex190516;

public class TicketMain {

	public static void main(String[] args) {
		//1.사전예약 티켓 일반 예매 티켓을 각각 객체로 만들어서
		//사전예약
		BookingTicket bt = new BookingTicket(100,50);
		bt.setTicketPrice(200000);
		System.out.println("당신의 사전예약 티켓 번호는"+bt.getTicketNum()+"이고 구매가격은 "+bt.getTicketPrice());
		
		//일반예약
		NormalTicket nene = new NormalTicket (100,30);
		System.out.println("당신의 사전예약 티켓 번호는"+bt.getTicketNum()+"이고 구매가격은 "+bt.getTicketPrice());
		//각 티켓번호 구매가격을 출력하시오.
		
	
	}

}
