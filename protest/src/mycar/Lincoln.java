package mycar;

import java.util.Scanner;

public class Lincoln {

	public static void main(String[] args) {

		/*
		 * ������ �г��� �Է¹޾� �հ� �Ǵ� ���հ��� ����ϴ� ���α׷� 1.1~3�г��� ������ 60�� �̻��̿��� �հ� 2.4�г��� 70�� �̻� �հ�
		 * 3.��ø if ���� ����ϼ���
		 */
		Scanner scan = new Scanner(System.in);
		int score,year;
		System.out.println("������ �Է��ϼ���");
		score=scan.nextInt();
		System.out.println("�г��� �Է��ϼ���");
		year=scan.nextInt();
		if(score>=60 ) {
			//�հ� ó���κ�
			//1~3�г��� 60�̻� �հ�,4�г��� 70�̻��հ�
			if(year !=4) {
				//1~3�г��̸鼭 ������ 60�̻�
				System.out.println("�հ��Դϴ�.");
			} else if (score>=70) {
				//4�г��̸鼭 ������ 70�̻�
				System.out.println("�հ��Դϴ�.");
			}else {
				//4�г��̸鼭 ������ 60�̻� 70�̸�
				System.out.println("���հ��Դϴ�.");
			}
		} else {
			//���հ� ó�� �κ� (score<60)
			System.out.println("���հ��Դϴ�.");
		}
		scan.close();
		
	}
}

		 