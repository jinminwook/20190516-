package ex1
90516;

public class NormalTicket extends Ticket{

	private boolean payByCredit;
	public NormalTicket(int ticketNum, boolean payByCredit) {
		super(ticketNum);
		this.payByCredit = payByCredit;
	}
		//Ƽ�� ���� ������ ���� �޼ҵ�
		@Override
		public double getTicketPrice() {
			if(payByCredit) 
				return ticketPrice * 1.05;
				else
					return ticketPrice;
			
		}
	//ī����� ���θ� �����ϴ� �޼ҵ�(payByCredit�ʵ尪 ����)
		boolean idpayByCredit() {
			return payByCredit;
		}
	
	
	
	
	
	
	
	
	
	
	
	//1.�Ϲ� Ƽ�� Ƽ���� ���� �� �� Ƽ�Ϲ�ȣ�� �ſ�ī�� ���� ���� ������ ������ ����.
	
	//2.�ſ�ī��� �����ϴ� ��� 5%�ݾ��� �����.
	
	
	
}
