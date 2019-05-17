package ex190516;

public class Ticket {
	//각 티켓은 티켓번호와 가격 정보를 가지고있음.
	//필드 선언
	 int ticketNum;
	 double ticketPrice;
	//생성자 선언
	Ticket(int ticketNum){
		this.ticketNum=ticketNum;
	
		
	}
	
	
	public int getTicketNum() {
		return ticketNum;
	}
	public void setTicketNum(int ticketNum) {
		this.ticketNum = ticketNum;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	
}
