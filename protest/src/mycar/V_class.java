package mycar;

import java.util.Scanner;

public class V_class {

	public static void main(String[] args) {

	/*
	 * 은행 프로그햄
	 */
		boolean run = true;
		int balance=0;
		int sum=0;
		int out=0;
		int chang=0;
		Scanner Scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("------------------------");
			System.out.print("선택>");
			
			int menuNum = Scan.nextInt();
			if(menuNum==1) {
				System.out.println("예금액>");
				sum=Scan.nextInt();
				chang+=sum;
				System.out.println("잔고>"+chang);
			}else if (menuNum==2) {
				System.out.println("출금액>");
				out=Scan.nextInt();
			if(chang<out) {
				System.out.println("잔액이 부족합니다.");
			}
			else {
				chang-=out;
				System.out.println("잔고>"+chang);
			}
			}
			else if (menuNum==3) {
				System.out.println("잔고>"+chang);
			}else if (menuNum==4) {
				System.out.println("안녕히 가십시오.");
				break;
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
