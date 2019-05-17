package ex1
90516;

public class NormalTicket extends Ticket{

	private boolean payByCredit;
	public NormalTicket(int ticketNum, boolean payByCredit) {
		super(ticketNum);
		this.payByCredit = payByCredit;
	}
		//티켓 가격 리턴을 위한 메소드
		@Override
		public double getTicketPrice() {
			if(payByCredit) 
				return ticketPrice * 1.05;
				else
					return ticketPrice;
			
		}
	//카드결제 여부를 리턴하는 메소드(payByCredit필드값 리턴)
		boolean idpayByCredit() {
			return payByCredit;
		}
	
	
	
	
	
	
	
	
	
	
	
	//1.일반 티켓 티켓이 발행 될 때 티켓번호와 신용카드 결제 여부 정보를 가지고 있음.
	
	//2.신용카드로 결제하는 경우 5%금액이 가산됨.
	
	
	
}
