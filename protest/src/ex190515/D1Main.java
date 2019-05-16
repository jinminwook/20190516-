package ex190515;

import java.util.Scanner;

public class D1Main {

	public static void main(String[] args) {

		
	Scanner scan = new Scanner(System.in);
	//객체 선언
	D1 nana = new D1();
	boolean run = true;
	while(run) {
		System.out.println("----------------------");
		System.out.println("수행할 서비스를 선택해주세요.");
		System.out.println("1.로그인||2.로그아웃||3.종료");
		System.out.println(">>");
		int choice = scan.nextInt();
		switch(choice) {
		case 1:
			//id,pw 입력 받아서
			//로그인 처리용 메소드 호출
			System.out.println("아이디를 입력하세요 :");
			String id = scan.next();
			System.out.println("비밀번호를 입력하세요 :");
			String pw = scan.next();
			//객체에 있는 로그인 처리용 메소드 호출
			nana.login(id, pw);
			
//			//리턴이 있는 로그인 메소드를 호출하여 로그인을 수행하는 경우.
//			boolean result = nana.loginBool(id, pw);
//			if(result) {
//				System.out.println(id+"님 로그인 되었습니다.");
//				
//			}else {
//				System.out.println("id또는 pw 가 올바르지 않습니다.");
//				
//			}
			break;
		case 2:
			nana.logout();
			break;
		case 3:
			System.out.println("종료합니다.");
			run =false;
			break;
		}
	}
	}

}
