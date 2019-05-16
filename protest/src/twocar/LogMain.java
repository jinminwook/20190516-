package twocar;

import java.util.Scanner;

public class LogMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String idd;
		int pww;
		Log nana = new Log();
		boolean lo=true;
		
		while(lo) {
			System.out.println("수행할 서비스를 선택해주세요.");
			System.out.println("1.로그인||2.로그아웃||3.종료");
			int check =scan.nextInt();
			switch(check) {
			case 1:
				System.out.print("아이디를 입력하세요: ");
				idd = scan.next();
				System.out.println("비밀번호를 입력하세요:" );
				pww = scan.nextInt();
				if(idd.equals(nana.id)) {
				
				}else if(pww==nana.pw) {
					System.out.println(nana.id+"님 로그인 되었습니다.");
					break;
				}else{
					System.out.println("id 또는 password가 올바르지 않습니다.");
					break;
				}
			case 2:
				
				System.out.println( "로그아웃 되었습니다.");
				break;
				
				
			case 3:
				System.out.println("시스템을 종료합니다.");
				lo=false;
				
			}
		}
	}

}
