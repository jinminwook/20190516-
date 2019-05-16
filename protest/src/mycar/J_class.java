package mycar;

import java.util.Scanner;

public class J_class {

	public static void main(String[] args) {
		/*
		 * do ~ while 예제
		 */
		System.out.println("메시지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
				String inputString;
				
				do {
					System.out.print(">");
					inputString = scanner.nextLine();
					System.out.println(inputString);
				}while(! inputString.equals("q"));//입력이 q가들어오면 실행을 종료시킴
		
		System.out.println();
				System.out.println("프로그램종료");
		scanner.close();
		
	}

}
