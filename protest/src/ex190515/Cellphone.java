package ex190515;
//�θ�Ŭ����
public class Cellphone {
	//�ʵ� ����
	String model;//String Ÿ���� �ʵ� �ΰ� ����.
	String color;
	
	//�޼ҵ� ����
	void powerOn() {
		System.out.println("������ �մϴ�.");
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	void sendVoice(String message) {
		System.out.println("�ڱ� :"+message);
	}
	void receiveVoice(String message) {
		System.out.println("���� :"+message);
	}
	void hangUp() {
		System.out.println("��ȭ�� �����ϴ�.");
	}
}
