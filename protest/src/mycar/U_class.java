package mycar;

import java.util.Scanner;

public class U_class {

	public static void main(String[] args) {
		int yes=0;
		int count=0;
		Scanner Scan = new Scanner(System.in);
		System.out.println("1�� 100������ ���� �Է��ϼ��� : ");
		
		int num = (int) (Math.random()*100)+1;
		while(true) {
			yes = Scan.nextInt();
			count++;
			if(yes==num) {
				System.out.println("�����Դϴ�.");
				break;
			}if (yes<num) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			}else {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}
		}
		System.out.println("�õ�Ƚ���� " + count + "�� �Դϴ�.");
		
		
		
		
		
		
		
		
	}

}
