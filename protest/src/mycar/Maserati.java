package mycar;

public class Maserati {

	public static void main(String[] args) {
			/* ���� ������
			 * ����:++,--
			 * �����տ� ++�� ���� ������ ������ �ִ� ���� 1�� ������Ų �� ���꿡 �����.
			 * ���� �ڿ� ++�� ���� ������ �������ִ� ���� �ϴܿ��꿡 ����� �� ���� ���� 1������Ŵ.
			 * ��� for �� �� ���� ����� (�ݺ���)
			 * 
			 */
		int x=10;
		int y=10;
		int z;
		System.out.println("x++ ���� �� " + x);
		x++;
		System.out.println("x++ ���� �� " + x);
		
		System.out.println("++x ���� �� " + x);
		++x;
		System.out.println("x++ ���� �� " + x);
		
		System.out.println("y �� " + y);
		y--;
		System.out.println("y �� " + y);
		--y;
		System.out.println("y �� " + y);
		//x=12 y=8 z=
		z=x++;//���� x���� 12�� z �� ������ �� x�� ���� 1������Ŵ
		System.out.println("z �� " + z);
		System.out.println("y �� " + y);
		//x=13 y=8 z=12
		
		z=++x;
		System.out.println("z �� " + z);
		System.out.println("y �� " + x);
		//x=14 y=8 z=14
		z=++x + y++;
		System.out.println("z �� " + z);
		System.out.println("x �� " + x);
		System.out.println("y �� " + y);
		
	}

}
