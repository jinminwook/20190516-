package ex190516;

public class Ticket {
	//�� Ƽ���� Ƽ�Ϲ�ȣ�� ���� ������ ����������.
	//�ʵ� ����
	 int ticketNum;
	 double ticketPrice;
	//������ ����
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
