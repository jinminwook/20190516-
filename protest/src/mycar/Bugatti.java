package mycar;

import java.util.Scanner;

public class Bugatti {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int second;
		int min;
		int hour;
		int time;
		System.out.print("초를 입력하세요 : ");
		time=scan.nextInt();
		//시간 계산
		hour=time/3600;
		//분 계산
		min=(time%3600)/60;
		//초 계산
		second =(time%3600)%60;
		//계산 결과 출력
		System.out.print(time+"초는"+hour+"시간"+min+"분"+second+"초"+"입니다");
		
		scan.close();
		
		
		
		
		
		
		
		
		
		
	}

}
