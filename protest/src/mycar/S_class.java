package mycar;

import java.util.Scanner;

public class S_class {

	public static void main(String[] args) {

		
		int sum,end;
		int u=0;
		Scanner scan = new Scanner(System.in);
		 System.out.println("시작 값을 입력하세요");
		 sum=scan.nextInt();
		 System.out.println("끝 값을 입력하세요");
		 end=scan.nextInt();
		for(int i=sum;i<=end;i++){
			u+=i;
		}
		System.out.println("까지더한값은 : "+u );
		scan.close();
		
		
		
		
	}

}
