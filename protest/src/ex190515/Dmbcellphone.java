package ex190515;
//Cellphone Ŭ������ �ڽ�Ŭ������ ����]
//�θ�Ŭ���� : CellPhone Ŭ����
//�ڽ�Ŭ���� : DmbcellPhone Ŭ����
//��� ���� ���
//�ڽ�  Ŭ�����̸� extends �θ�Ŭ���� �̸�
public class Dmbcellphone extends Cellphone{// extends ��ӽ�Ű�ڴٴ� ��.
	//�ʵ弱��
	int channel;
	
	//������ ����
	Dmbcellphone(String model,String color,int channel){
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	//�޼ҵ� ����
	void turnOnDmb(){
		System.out.println("ä��"+channel+"�� DMB��� ������ �����մϴ�.");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("ä��"+channel+"������ �ٲ�ϴ�.");
	}
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
	
	
}
