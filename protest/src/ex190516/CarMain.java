package ex190516;

public class CarMain {

	public static void main(String[] args) {

		
		//a.sedan,truck�� ���� ��ü ���� ����
		Sedan nana = new Sedan(100,"������");
		nana.Color="������";
		Truck nene = new Truck(60,"����",5);
		nene.Color="������";
		//b.sedan�� �ӵ��� 200,truck�� �ӵ��� 100���� �ø�.
		nana.sp(100);
		nene.sp(40);
		
		//c.sedan�� �¼����� 5 truck�� ���緮�� 5�� ����.
		nana.setSeatNum(5);
		//d.��¹�
		//1.������ �¿����� �ӵ��� 200�̰� �¼����� 5�� �Դϴ�.
		System.out.println(nana.Color+" �¿����� �ӵ��� "+nana.speed+" �̰� �¼����� "+nana.getSeatNum()+"�� �Դϴ�.");
		//2.������ Ʈ���� �ӵ��� 100�̰� ���緮�� 5���Դϴ�.
		System.out.println(nene.Color+" Ʈ���� �ӵ���  "+nene.speed+" �̰� ���緮��"+nene.getCapacity()+"�� �Դϴ�.");
	}

}
