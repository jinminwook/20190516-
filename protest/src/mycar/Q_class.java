package mycar;

import java.util.Scanner;

public class Q_class {

	public static void main(String[] args) {
		int num; //�Է��ϴ� ��
		int j=0,o=0; //j=��� .o=�հ�
		int	p=0; //����
		Scanner Scan = new Scanner(System.in);
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���.");
		
		
	
	
		do {
			num=Scan.nextInt();
			o+=num;//�� 
			
			p++;//����
			if(num==0) {	
				p--;
				System.out.println("���� ������ "+p+"���̸� �����"+j+"�Գ״�.");
				break; // �ݺ� ���߱�
			}
			j=o/p;//���
			
			
		}while(num!=0);
		
				Scan.close();
	}
}
