package mycar;

public class Cadillac {

	public static void main(String[] args) {

		//���� ���� �߻�
		int num = (int)(Math.random()*6)+1;
		//switch case �� ���
		switch(num) {
		case 1://num==1
				System.out.println("1���� ���Ծ�");
				break;
		case 2:
				System.out.println("2���� ���Ծ�");
				break;
		case 3:
				System.out.println("3���� ���Ծ�");
				break;
		case 4:
				System.out.println("4���� ���Ծ�");
				break;
			
		default://�⺻�̶�� ��
				System.out.println("�ٸ����ڰ� ���Ծ�");
				break;
		
		}
		
		
		
	}

}
