package mycar;

import java.util.Scanner;

public class Chevrolet {

	public static void main(String[] args) {

		/*������ ��ĵ���� �Է¹޾Ƽ�
		 * 90~100���̸� A
		 * 80~89���̸� B
		 * 70~79���̸�C
		 * 60~69���̸�D
		 * 60�� �̸��̸� F�� ����ϴ� ���α׷�.
		 */
		int score;
		Scanner scan = new Scanner(System.in);
		System.out.print("����� ������ �� ���Դϱ�?");
		score=scan.nextInt();
		
		if(score>=90) {
			System.out.println("����� ����� A �Դϴ�.");
		}
		else if (score>=80) {
			System.out.println("����� ����� B �Դϴ�");
		}
			else if (score>=70) {
				System.out.println("����� ����� C �Դϴ�");
			}
				else if (score>=60) {
					System.out.println("����� ����� D �Դϴ�");
				}
					else{
			System.out.println("�����..���̾��׿� ȯ���ϼ���.");
		}
		
		
		System.out.println();
		
		
		
		
		
	}

}
