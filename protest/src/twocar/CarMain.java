package twocar;

public class CarMain {

	public static void main(String[] args) {

		//��ü ����
		//1.�⺻�����ڸ� ȣ���Ͽ� ��ü ����
		Car mycar1=new Car();
		//2.model�� �Ű������� �ϴ� �����ڸ� ȣ���Ͽ� ��ü ����
		Car mycar2=new Car("SŬ����");
		System.out.println(mycar2.model);
		//3.medel,color�� �Ű������� �ϴ� ������ ȣ���Ͽ� ��ü ����
		Car mycar3=new Car("EŬ����","���");
		System.out.println(mycar3.model);
		//4.model,color,maxSpeed�� �Ű������� �ϴ� ������ ȣ���Ͽ� ��ü ����
		System.out.println(mycar3.color);
		//�� ��ü�� �ʵ尪 ���
		Car mycar4=new Car("CŬ����","������",300);
		System.out.println(mycar4.model);
		System.out.println(mycar4.color);
		System.out.println(mycar4.maxSpeed);
	}

}
