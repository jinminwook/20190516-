package mycar;

import java.util.Scanner;

public class Ssangyoung {

	public static void main(String[] args) {

		/* 사다리꼴 각 변의 길이를 입력받아 넓이를 계산하는 프로그램을 작성하시오
		 * (아랫변+윗변)×높이÷2
		 */
		double top_side,bottom_side,height;
		Scanner scan = new Scanner(System.in);
		System.out.print("밑 변 의 길이는?");
		bottom_side=scan.nextInt();
		System.out.print("윗 변 의 길이는? ");
		top_side=scan.nextInt();
		System.out.print("높이는?? ");
		height=scan.nextInt();
		System.out.print("입력하신 사다리꼴의 넓이는"+(bottom_side+top_side)*(height)/2+"입니다.");
		
		scan.close();
		
		
		
		
		
		
		
	}

}
