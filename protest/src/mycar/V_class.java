package mycar;

import java.util.Scanner;

public class V_class {

	public static void main(String[] args) {

	/*
	 * ���� ���α���
	 */
		boolean run = true;
		int balance=0;
		int sum=0;
		int out=0;
		int chang=0;
		Scanner Scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1.����|2.���|3.�ܰ�|4.����");
			System.out.println("------------------------");
			System.out.print("����>");
			
			int menuNum = Scan.nextInt();
			if(menuNum==1) {
				System.out.println("���ݾ�>");
				sum=Scan.nextInt();
				chang+=sum;
				System.out.println("�ܰ�>"+chang);
			}else if (menuNum==2) {
				System.out.println("��ݾ�>");
				out=Scan.nextInt();
			if(chang<out) {
				System.out.println("�ܾ��� �����մϴ�.");
			}
			else {
				chang-=out;
				System.out.println("�ܰ�>"+chang);
			}
			}
			else if (menuNum==3) {
				System.out.println("�ܰ�>"+chang);
			}else if (menuNum==4) {
				System.out.println("�ȳ��� ���ʽÿ�.");
				break;
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
