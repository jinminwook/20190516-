package mycar;

import java.util.Scanner;

public class J_class {

	public static void main(String[] args) {
		/*
		 * do ~ while ����
		 */
		System.out.println("�޽����� �Է��ϼ���");
		System.out.println("���α׷��� �����Ϸ��� q�� �Է��ϼ���.");
		
		Scanner scanner = new Scanner(System.in);
				String inputString;
				
				do {
					System.out.print(">");
					inputString = scanner.nextLine();
					System.out.println(inputString);
				}while(! inputString.equals("q"));//�Է��� q�������� ������ �����Ŵ
		
		System.out.println();
				System.out.println("���α׷�����");
		scanner.close();
		
	}

}
