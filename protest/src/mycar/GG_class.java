package mycar;

import java.util.Scanner;

public class GG_class {

	public static void main(String[] args) {

		/*
		 * �������� ���ϱ�.
		 * ��)2680���� �Է��ϸ�
		 * 500�� :5��
		 * 100��:1��
		 * 50�� :1��
		 * 10��3��
		 */
		   /*
	       * ex)2680���� �Է��ϸ�
	       * 500�� : 5��
	       * 100�� : 1��
	       * 50�� : 1��
	       * 10�� : 3��
	       */
	      int money;
	      int temp = 0;
	      Scanner scan=new Scanner(System.in);
	      System.out.println("�Ž����� ���� �ݾ��� �Է��Ͻÿ�.:");
	      money=scan.nextInt();
	      int Money[]={500,100,50,10};
	      for(int i=0;i<Money.length;i++) {
	         if(money>=Money[i]) {
	            temp=money/Money[i];
	            money=money%Money[i];
	            System.out.println(Money[i]+"�� ���� :"+temp);
	         }
	         }
	      scan.close();
	      }
	   }