package mycar;

import java.util.Scanner;

public class BB_class {

	public static void main(String[] args) {

	//���� 1.���� 5���� �Է¹޾� ������������ �����Ͻÿ�.
		Scanner scan = new Scanner(System.in);
		int[] num=new int[5];
		for(int k=0;k<num.length;k++) {
			num[k]=scan.nextInt();
		}
		
		int temp;
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i] > num[j]) {
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		for (int n =0;n<num.length;n++)
			System.out.println(num[n]);
			
	}
}
