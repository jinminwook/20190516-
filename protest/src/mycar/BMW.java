package mycar;

public class BMW {

	public static void main(String[] args) {
		/*
		 * ������ (Operator) 1.��� ������ +,-,*,/,%(������ ����) ex)5%2 �ϰԵǸ� =1�̴� ��:2 ������:1 2.��ȣ������
		 * - (���ھտ� ���̸� ��������) 3.���Կ����� +=,-=,*=,/= (a+=b =>a=a+b) 4.���������� ++,--
		 * (++����,����++) 5.�񱳿����� <,>,>=,<=,== :����� boolean (*5>2:��=true,5<2:����=false)
		 * 6.�������� And=& OR=|| Not=!
		 * 
		 */
		int jin = 20, min = 10;
		System.out.println("���Ѱ�:" + jin * min);
		System.out.printf("���Ѱ� : ");
		System.out.println(jin + min);
		System.out.printf("���� : ");
		System.out.println(jin - min);
		System.out.println("�����⿬��:" + jin / min);
		System.out.println("����������:" + jin % min);

		String a = "�ڹ�";
		String b = "�����";
		String c = a + b;
		System.out.println(c);

		/*
		 * int wook=jin+min; System.out.printf(wook); String a='�ڹ�'; String b='�����';
		 * String c=a+b; system.out.println(c); int->double :�ڵ� ����ȯ
		 * 
		 */

	}

}
