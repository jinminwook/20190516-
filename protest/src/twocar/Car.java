package twocar;

public class Car {
//�ʵ弱��
	String company = "����";
	String model;
	String color;
	int maxSpeed;

	
	
	/*���������� �����ڸ� ����
	 * 1.�⺻������
	 * 2.model�� �Ű������� �ϴ� ������
	 * 3.medel,color�� �Ű������� �ϴ� ������
	 * 4.model,color,maxSpeed�� �Ű������� �ϴ� ������
	 * 
	 * �� �����ڸ� ����� CarMain Ŭ��������
	 * �� �����ڸ� ȣ���Ͽ� ��ü�� ����� �ʵ尪 ���
	 * 
	 */
	Car(){
		
	}
	Car(String model){
		this.model=model;
	}
	Car(String model,String color){
		this.model=model;
		this.color=color;
	}
	Car(String model,String color,int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
}
