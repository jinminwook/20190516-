package twocar;

import java.util.Scanner;

public class BankMain {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean good = true;
		int check;
		Bank nana = new Bank();
		while(good) {
			System.out.println("========================================");
			System.out.println("|1.이름|2.계좌번호|3.예금액|4.출금|5.잔액조회");
			System.out.println("========================================");
			check = scan.nextInt();
			if(check==1) {
				System.out.println("이름을 입력하세요");
				nana.name = scan.next();
			}else if (check==2) {
				System.out.println("계좌번호를 입력하세요");
				nana.banknumber = scan.nextInt();
			}else if(check==3) {
				System.out.println("예금액을 입력하세요");
				nana.in = scan.nextInt();
				nana.chang+=nana.in;
			}else if(check==4) {
				System.out.println("출금액을 입력하세요.");
				nana.out = scan.nextInt();
				if(nana.chang<=nana.out) {
					System.out.println("잔액이 부족합니다.");
				}else {
					nana.chang-=nana.out;
				}
			}else if(check==5) {
				System.out.println(nana.name+"님의 잔액은"+nana.chang+"원 입니다.");
			}
		}
	
	}

}
