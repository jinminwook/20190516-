package mycar;

public class K_class {

	public static void main(String[] args) {

		/*
		 * ���� �ݺ� ��
		 * �ֻ����� ������ 6�� ������ �ݺ��� ����
		 */
		boolean value=true;
		while(value) {
			int num =(int) (Math.random()*6)+1;
			System.out.println("����"+num);
			if(num==6) {
				value=false;
		}
		}
		System.out.println("�ݺ��� ����");
		
	}

}
 