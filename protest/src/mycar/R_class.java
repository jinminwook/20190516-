package mycar;

import java.util.Scanner;

public class R_class {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//���� �Է��� ���� ����
		int num=0;
		//�հ� ����� ���� ����
		int sum=0;
		//���� ����� ���� ����
		int count=0;
		System.out.println("������ �Է��ϰ� �������� 0�� �Է��ϼ���.");
		//while�� ��� ���� ����
		boolean run = true; //��Ÿ�� ���� ����
		while(run) {
			num=scan.nextInt();
			sum=sum+num;
			if(num==0) {//num�� 0�� ����̵ɶ� �����.
				run=false;
			}else {
				count++;
			}
		
			
			}
		System.out.println("�Է��� ����"+count+"��");
		System.out.println("�����"+(sum/count)+"�Դϴ�.");
		}
	}


