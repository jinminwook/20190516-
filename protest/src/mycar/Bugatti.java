package mycar;

import java.util.Scanner;

public class Bugatti {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int second;
		int min;
		int hour;
		int time;
		System.out.print("�ʸ� �Է��ϼ��� : ");
		time=scan.nextInt();
		//�ð� ���
		hour=time/3600;
		//�� ���
		min=(time%3600)/60;
		//�� ���
		second =(time%3600)%60;
		//��� ��� ���
		System.out.print(time+"�ʴ�"+hour+"�ð�"+min+"��"+second+"��"+"�Դϴ�");
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
	}

}
