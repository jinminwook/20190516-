package ex190515;

public class ComputerMain {

	public static void main(String[] args) {
		
		/*
		 * Calculator,Computer Ŭ������ ���� ��ü��
		 * ���� �����Ͽ� circleArea �޼ҵ带 ���� ȣ�� ��
		 * ����� ����Ͻÿ�.
		 */
		//Calculator ��ü ����
		Calculator nana =new Calculator();
		Computer nene = new Computer();
		
		nana.circleArea(5);
		nene.circleArea(7);
		System.out.println(nana.circleArea(5));
		System.out.println(nene.circleArea(7));
		
		
		
	}

}
