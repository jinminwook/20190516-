package twocar;

import java.util.Scanner;

public class ExeriseMainMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		/*
		 * �л��� �̸�,����,����,������ �Է¹޾�
		 * ��� ������ 70�̻��̸� �հ�
		 * 70�̸��̸� ���հ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 * 
		 * �̸�,����,���� ������ �ʵ尪���� �����ϴ� ����� �� 2������ �ؼ� ����
		 * 1.�����ڸ� Ȱ���ϱ�
		 * 2.get,set �޼ҵ� Ȱ���ϱ�
		 * 
		 * �հ� ���հ��� result��� �޼ҵ带 ����ϵ���.
		 */
		//1.�� ��� �̿��ؼ� ����
		System.out.print("�̸�");
		String name =scan.next();
		System.out.print("��������");
		int kor = scan.nextInt();
		System.out.print("��������");
		int eg = scan.nextInt();
		
		ExeriseMain stu =
				new ExeriseMain(name,kor,eg);
		stu.result();
		//1�� ����� �̿��ؼ� ����
		System.out.println("------1�� ��� �� ------");
		//�Ű������� �ִ� �����ڸ� �̿��Ͽ� ��ü ����
		//�Ű����� name,kor,eg
		System.out.println("------2�� ��� ���� ------");
		
		
		//2.�� ��� �̿��ؼ� ����
		ExeriseMain stu1 =new ExeriseMain();
		//getter,setter �޼ҵ带 �̿��Ͽ� �ʵ尪 ����
		stu1.setName(name);
		stu1.setKor(kor);
		stu1.setEg(eg);
		stu1.result();
		System.out.println("------2�� ��� �� ------");
	}

}
