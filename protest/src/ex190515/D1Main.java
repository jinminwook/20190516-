package ex190515;

import java.util.Scanner;

public class D1Main {

	public static void main(String[] args) {

		
	Scanner scan = new Scanner(System.in);
	//��ü ����
	D1 nana = new D1();
	boolean run = true;
	while(run) {
		System.out.println("----------------------");
		System.out.println("������ ���񽺸� �������ּ���.");
		System.out.println("1.�α���||2.�α׾ƿ�||3.����");
		System.out.println(">>");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			//id,pw �Է� �޾Ƽ�
			//�α��� ó���� �޼ҵ� ȣ��
			System.out.println("���̵� �Է��ϼ��� :");
			String id = scan.next();
			System.out.println("��й�ȣ�� �Է��ϼ��� :");
			String pw = scan.next();
			//��ü�� �ִ� �α��� ó���� �޼ҵ� ȣ��
			nana.login(id, pw);
			
//			//������ �ִ� �α��� �޼ҵ带 ȣ���Ͽ� �α����� �����ϴ� ���.
//			boolean result = nana.loginBool(id, pw);
//			if(result) {
//				System.out.println(id+"�� �α��� �Ǿ����ϴ�.");
//				
//			}else {
//				System.out.println("id�Ǵ� pw �� �ùٸ��� �ʽ��ϴ�.");
//				
//			}
			break;
		case 2:
			nana.logout();
			break;
		case 3:
			System.out.println("�����մϴ�.");
			run =false;
			break;
		}
	}
	}

}
