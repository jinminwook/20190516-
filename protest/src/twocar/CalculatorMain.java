package twocar;

public class CalculatorMain {

	public static void main(String[] args) {
		//Calculator �������� ��ü ����
		Calculator nini = new Calculator();
		System.out.println("�޼ҵ� ȣ�� �� ");
		//Calculator Ŭ������ ������ �ִ� powerOn �޼ҵ� ȣ��
		nini.powerOn();
		System.out.println("�޼ҵ� ȣ�� �� ");
		
		//plus �޼ҵ� ȣ��
		int result = nini.plus(1,2);
		System.out.println(result);
		
		
		
		
	}

}
