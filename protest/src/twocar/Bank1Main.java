package twocar;

import java.util.Scanner;

public class Bank1Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Bank1 Ŭ���� Ÿ���� ��������.
		Bank1 stu = null;//�̷��� ������ ���� ���ϰԵǸ� �ؿ� �ν��� �������ϰԵ�.
		boolean run = true;//booleanŸ�� run ����.
		while(run) {//while ���� booleanŸ�� run �ְ� ����
			System.out.println("�ϰ� ���� ���� ����");//�ݺ��� ��¹� �Է�.
			System.out.println("1.�����(1��)||2.�����(2��)||3.�Ա�||4.���||5.�ܾ׺���||");
			int choice =scan.nextInt();//������ ���� choice �����ϰ� ����� ���� ���ڸ� �Է¹���.
			switch(choice){//switch���� ������ ������ choice ������ �ְ� ������.
				case 1://1���� ����������.
					System.out.println("�̸�");//"�̸�" �̶�� ��¹��� ���.
					String name = scan.next();// �Է��Ѱ��� String name�̶�� ������ ����.
					System.out.println("���¹�ȣ");//"���� ��ȣ"��� ��¹��� ���.
					String accountNumber = scan.next();//�Է��� ���� String accountNumber ��� ������ ��������.
					System.out.println("�ʱ� �Աݾ�");//"�ʱ� �Աݾ�"�̶�� ��¹��� ���.
					int balance = scan.nextInt();//�Է��� ���� balance��� ������ �����Ѵ�.
					//stu�� ��ü�� ����
					stu = new Bank1(name,accountNumber,balance);//���� �Է��� �� ������ ����.
					break;
				case 2://2���� ���������� 
					System.out.println("�̸�");//���� ���� ��µȴ�.
					name = scan.next();
					System.out.println("���¹�ȣ");
					accountNumber = scan.next();
					System.out.println("�ʱ��Աݾ�");
					balance = scan.nextInt();
					stu = new Bank1();//���� ������ �Ǿ��ֱ⶧���� �ҷ��´�.
					stu.setName(name);
					stu.setAccountNumber(accountNumber);
					stu.setBalance(balance);
				case 3://3���� ����������.
					System.out.println("�Աݾ��� �Է��ϼ���.");//�Է��� �� ���.
					int money = scan.nextInt();//�Ա��� �ݾ� �Է�.
					//deposit �޼ҵ� ȣ��
					//�Ű����� money
					stu.deposit(money);//deposit �޼ҵ忡 �Ա��ߴ� �ݾ� �ֱ�.
					break;
				case 4://4���� ����������.
					System.out.println("��ݾ��� �Է��ϼ���.");//�Է��� �� ���.
					money = scan.nextInt();
					stu.withdraw(money);
					break;
				case 5:
					stu.checkBalance();
					break;
				case 6:
					run = false;
			}
		}
			}
}

		
		
		
	
