package mycar;

import java.util.Scanner;

public class Bentley {

	public static void main(String[] args) {

			//스캐너를 사용하기 위한 선언
		Scanner scan = new Scanner(System.in);
		String name;
		System.out.print("이름이? : ");
		name=scan.next();
		System.out.println(name + " ㄳ.");
		int hi;
		System.out.print("나이가? ");
		hi=scan.nextInt();
		System.out.println(hi + " ㄳ");
		String map;
		System.out.print("지역이? ");
		map=scan.next();
		System.out.println(map+ " ㄳ ");
		
		System.out.println("사장님 이름 : " +name);
		System.out.println("사장님 나이 : "+hi);
		System.out.println("사장님 지역 : "+map);
		
		scan.close();
		
		/*
		 * 문자입력 :next()
		 * 정수입력:nextint()
		 * 실수입력:nextDouble()
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
