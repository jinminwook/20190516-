package twocar;

public class Calculator4Main {

	public static void main(String[] args) {//���� �޼ҵ���.
		//static �ʵ� ���
		//��ü ������ �ƴ� Ŭ������ ���� ����
		Calculator4 nana = new Calculator4();
		System.out.println(nana.pi);
		//static �޼ҵ� ���
		Calculator4.plus(10, 20);
		//��� ���
		System.out.println(Calculator4.EARTH_RADIUS);
		//����� �̿��Ͽ� ���� ���� ���ϱ�
		double earthArea = Calculator4.EARTH_RADIUS*
				Calculator4.EARTH_RADIUS*Math.PI;//Math.pi�� �ڹٿ��� �⺻������ ���� ���ִ� ���� ��.
		System.out.println("�������� :"+earthArea);
	}

}
