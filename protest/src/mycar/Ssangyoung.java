package mycar;

import java.util.Scanner;

public class Ssangyoung {

	public static void main(String[] args) {

		/* ��ٸ��� �� ���� ���̸� �Է¹޾� ���̸� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		 * (�Ʒ���+����)�����̡�2
		 */
		double top_side,bottom_side,height;
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �� �� ���̴�?");
		bottom_side=scan.nextInt();
		System.out.print("�� �� �� ���̴�? ");
		top_side=scan.nextInt();
		System.out.print("���̴�?? ");
		height=scan.nextInt();
		System.out.print("�Է��Ͻ� ��ٸ����� ���̴�"+(bottom_side+top_side)*(height)/2+"�Դϴ�.");
		
		scan.close();
		
		
		
		
		
		
		
	}

}
