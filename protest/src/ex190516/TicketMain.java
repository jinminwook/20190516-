package ex190516;

public class TicketMain {

	public static void main(String[] args) {
		//1.�������� Ƽ�� �Ϲ� ���� Ƽ���� ���� ��ü�� ����
		//��������
		BookingTicket bt = new BookingTicket(100,50);
		bt.setTicketPrice(200000);
		System.out.println("����� �������� Ƽ�� ��ȣ��"+bt.getTicketNum()+"�̰� ���Ű����� "+bt.getTicketPrice());
		
		//�Ϲݿ���
		NormalTicket nene = new NormalTicket (100,30);
		System.out.println("����� �������� Ƽ�� ��ȣ��"+bt.getTicketNum()+"�̰� ���Ű����� "+bt.getTicketPrice());
		//�� Ƽ�Ϲ�ȣ ���Ű����� ����Ͻÿ�.
		
	
	}

}
