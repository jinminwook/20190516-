package ex190515;

public class DmbcellphoneMain {

	public static void main(String[] args) {

		//DmbCellphone Ŭ������ ���� ��ü ����
		Dmbcellphone nana= new Dmbcellphone("OCN","Red",23);
		//model,color,channel �ʵ尪 ���� ���
		System.out.println(nana.model);
		System.out.println(nana.color);
		System.out.println(nana.channel);
		
		//�θ�Ŭ������ �������ִ� �޼ҵ� ���� ȣ��
		nana.powerOn();
		nana.powerOff();
		nana.bell();
		nana.sendVoice("��");
		nana.receiveVoice("����");
		nana.hangUp();
		//�ڽ�Ŭ������ �������ִ� �޼ҵ� ���� ȣ��
		nana.turnOnDmb();
		nana.changeChannelDmb(11);
		nana.turnOffDmb();
		
		
		
		
		
		
		
	}

}
