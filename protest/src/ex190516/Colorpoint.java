package ex190516;

import java.util.Set;

public class Colorpoint  extends Point{//point�� �ڽ�Ŭ����
	
	//A.String �ʵ� 1�� ����.
	String na;

	//B.setColor �޼ҵ�
		//i.1�� �Ű������� ���޹޾� �ʵ� ������ ������.
	void setColor(String na){
		this.na =na;
	}
	//showColorpoint �޼ҵ�
	void showColorPoint(){
		System.out.println(na);
		showpoint();//�θ� �������ִ� �޼ҵ� ȣ��//������ �ϱ� ���� �޼ҵ带 ȣ���Ҷ� super�� ����.
	}
	//i.�ʵ尪 ����ϴ� print��
	//ii.showpoint �޼ҵ� ȣ����.
	
}
