package mycar;

import java.util.Scanner;

public class Z_class {

	public static void main(String[] args) {

		/*
		 * 1.ũ�Ⱑ 3�� ������ �迭 ����
		 * 2.��ĳ�ʸ� �̿��Ͽ� ���� 3���Է�
		 * 3.�Էµ� ���� ����,��հ��
		 */
		int[] asd =new int [3];
		int sut,hap=0;
		int sum=0;
		Scanner scan = new Scanner(System.in);
//		sut=scan.nextInt();
//		ja=scan.nextInt();
//		hap=scan.nextInt();
//		sum+=sut+ja+hap;
//		System.out.println("3���� �� "+sum);
//		System.out.println("3���� ��� "+sum/asd.length);
		
		for(int i =0;i<asd.length;i++) {
			sut=scan.nextInt();
			sum+=sut;
			hap=sum/asd.length;
		}System.out.println("��"+sum);
		System.out.println("���"+hap);
		}
	}


