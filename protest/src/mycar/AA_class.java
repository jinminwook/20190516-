package mycar;

import java.util.Scanner;

public class AA_class {

	public static void main(String[] args) {

		//���� ���� 5���� �迭�� �Է¹޾Ƽ�
		//���� ū ���� ��� �ϼ���.
		int[] num = new int[5];
		int max=0;
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<num.length;i++) {
			num[i]=scan.nextInt();
			if(num[i]>max) {
			   max=num[i];
			}
			
		
	}
			System.out.	println(max);
	}
}

