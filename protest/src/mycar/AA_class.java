package mycar;

import java.util.Scanner;

public class AA_class {

	public static void main(String[] args) {

		//문제 정수 5개를 배열에 입력받아서
		//가장 큰 수를 출력 하세요.
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

