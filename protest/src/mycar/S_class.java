package mycar;

import java.util.Scanner;

public class S_class {

	public static void main(String[] args) {

		
		int sum,end;
		int u=0;
		Scanner scan = new Scanner(System.in);
		 System.out.println("���� ���� �Է��ϼ���");
		 sum=scan.nextInt();
		 System.out.println("�� ���� �Է��ϼ���");
		 end=scan.nextInt();
		for(int i=sum;i<=end;i++){
			u+=i;
		}
		System.out.println("�������Ѱ��� : "+u );
		scan.close();
		
		
		
		
	}

}
