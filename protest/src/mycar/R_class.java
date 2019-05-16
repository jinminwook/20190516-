package mycar;

import java.util.Scanner;

public class R_class {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//숫자 입력을 위한 변수
		int num=0;
		//합계 계산을 위한 변수
		int sum=0;
		//숫자 계산을 위한 변수
		int count=0;
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
		//while문 제어를 위한 변수
		boolean run = true; //불타입 변수 선언
		while(run) {
			num=scan.nextInt();
			sum=sum+num;
			if(num==0) {//num에 0이 출력이될때 멈춘다.
				run=false;
			}else {
				count++;
			}
		
			
			}
		System.out.println("입력한 수는"+count+"개");
		System.out.println("평균은"+(sum/count)+"입니다.");
		}
	}


