package mycar;

import java.util.Scanner;

public class Q_class {

	public static void main(String[] args) {
		int num; //입력하는 값
		int j=0,o=0; //j=평균 .o=합계
		int	p=0; //갯수
		Scanner Scan = new Scanner(System.in);
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
		
		
	
	
		do {
			num=Scan.nextInt();
			o+=num;//합 
			
			p++;//갯수
			if(num==0) {	
				p--;
				System.out.println("수의 개수는 "+p+"개이며 평균은"+j+"입네다.");
				break; // 반복 멈추기
			}
			j=o/p;//평균
			
			
		}while(num!=0);
		
				Scan.close();
	}
}
