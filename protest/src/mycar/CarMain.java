package mycar;

public class CarMain {

	public static void main(String[] args) {
		//�⺻�����ڸ� �̿��� car��� �̸��� ��ü����
		Car Car = new Car();
		//�Ű����� String color,int cc�� �̿���
		//car2 ����̸��� ��ü ����
		Car Car2=new Car("����",3000);
		
		System.out.println(Car2.ccField);
		System.out.println(Car2.colorField);
		System.out.println(Car.ccField);
		System.out.println(Car.colorField);
		
		
//		//CarŬ������ ���� ��ü ����
//		Car Audi = new Car();
//		//��ü �߰� ����
//		Car Audi2= new Car();
//		
//		
//		//car Ŭ������ ������ �ʵ尪 ���
//		//��ü�̸�.�ʵ��
//		System.out.println(Audi.color);
//		System.out.println(Audi.company);
//		System.out.println(Audi.maxSpeed);
//		System.out.println(Audi.model);
//		System.out.println(Audi.speed);
//		
//		//�ʵ尪 ����
//		Audi.speed = 100;
//		System.out.println(Audi.speed);
//		//car2�� speed �ʵ尪 Ȯ��
//		System.out.println(Audi2.speed);
		
		
		
	}

}
