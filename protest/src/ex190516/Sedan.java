package ex190516;

public class Sedan extends Car{//Car Ŭ������ �ڽ�Ŭ����
		
	//a.�¼����� ���� ��  �ִ� �ʵ�
	int seatNum;
	

	//������ ����
	Sedan(int speed,String color){
		super(speed,color);
	}
	//b.�޼ҵ弱�� (getter,setter)
	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	
}
