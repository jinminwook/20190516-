package twocar;

public class Car1Main {

	public static void main(String[] args) {
		Car1 caca=new Car1();
		//Car Ŭ���� ��ü ����
		caca.setGas(5);
		//setGas �޼ҵ� ȣ��. �Ű����� 5
		boolean gasState=caca.isLeftGas();
		//isLeftGas �޼ҵ带 ȣ���ؼ� ȣ�� ����� gasState ��� ������ ����
		//gas �ʵ尪 ���
		System.out.println(caca.gas);
		//run �޼ҵ� ȣ��
		if(gasState) {
			System.out.println("���");
			caca.run();
		}
		
		
		
		
	}

}
