package twocar;

import java.util.Scanner;

public class BankMain {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean good = true;
		int check;
		Bank nana = new Bank();
		while(good) {
			System.out.println("========================================");
			System.out.println("|1.�̸�|2.���¹�ȣ|3.���ݾ�|4.���|5.�ܾ���ȸ");
			System.out.println("========================================");
			check = scan.nextInt();
			if(check==1) {
				System.out.println("�̸��� �Է��ϼ���");
				nana.name = scan.next();
			}else if (check==2) {
				System.out.println("���¹�ȣ�� �Է��ϼ���");
				nana.banknumber = scan.nextInt();
			}else if(check==3) {
				System.out.println("���ݾ��� �Է��ϼ���");
				nana.in = scan.nextInt();
				nana.chang+=nana.in;
			}else if(check==4) {
				System.out.println("��ݾ��� �Է��ϼ���.");
				nana.out = scan.nextInt();
				if(nana.chang<=nana.out) {
					System.out.println("�ܾ��� �����մϴ�.");
				}else {
					nana.chang-=nana.out;
				}
			}else if(check==5) {
				System.out.println(nana.name+"���� �ܾ���"+nana.chang+"�� �Դϴ�.");
			}
		}
	
	}

}
