package mycar;

import java.util.Scanner;

public class JJ_class {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = null;
		int sum=0;
		double phyung=0;
		int max=0;
		int score=0;
		boolean choice=true; 
		while (choice) {
			System.out.println("----------------------------------------");
			System.out.println("1.�л���|2.�����Է�|3.��������Ʈ|4.�м�|5.����");
			System.out.println("----------------------------------------");
			System.out.print("����>");
			
			int sun = scan.nextInt();
			if(sun==1) {
				System.out.println("�л���>");
				int hak = scan.nextInt();
				num = new int [hak];
			}if (sun==2) {
				for(int i=0;i<num.length;i++) {
					System.out.println(i+1+"�� ° �л� ����>");
					num[i] = scan.nextInt();
				}
			}else if(sun==3) {
				for(int j=0;j<num.length;j++) {
					System.out.println(j+"�� ° �л�����>"+num[j]);
				}
				
			}else if(sun==4) {
				for(int k=0;k<num.length;k++) {
					sum+=num[k];
					phyung=sum/num.length;
					if(max<num[k]) {
						max=num[k];
						/*
						 * �Էµ� �� �� �ִ�,��հ� ���
						 * 1.�ִ� ���
						 * 1.1�ִ� ����� ���� ����
						 * 1.2�ִ��� ã�� ���??
						 * =>�񱳹��� �̿�??
						 * 2. ��հ� ���
						 * 2.1 ����� ���ϱ� ���ؼ��� �հ� ���� �ʿ�
						 * 2.2 �հ谪�� ���??
						 * 2.3 ��հ� ����� ���� ������ ����
						 */
					}
				}
				System.out.println("�������"+phyung);
				System.out.println("�ְ�����"+max);
				
			}else if(sun==5) {
				//while �� ����
				System.out.println("�����մϴ�.");
				choice = false;
			}
				
		}
	}

}
