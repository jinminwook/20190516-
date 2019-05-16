package mycar;

import java.util.Scanner;

public class Lincoln {

	public static void main(String[] args) {

		/*
		 * 점수와 학년을 입력받아 합격 또는 불합격을 출력하는 프로그램 1.1~3학년은 점수가 60점 이상이여야 합격 2.4학년은 70점 이상 합격
		 * 3.중첩 if 문을 사용하세요
		 */
		Scanner scan = new Scanner(System.in);
		int score,year;
		System.out.println("점수를 입력하세요");
		score=scan.nextInt();
		System.out.println("학년을 입력하세요");
		year=scan.nextInt();
		if(score>=60 ) {
			//합격 처리부분
			//1~3학년은 60이상 합격,4학년은 70이상합격
			if(year !=4) {
				//1~3학년이면서 점수는 60이상
				System.out.println("합격입니다.");
			} else if (score>=70) {
				//4학년이면서 점수는 70이상
				System.out.println("합격입니다.");
			}else {
				//4학년이면서 점수는 60이상 70미만
				System.out.println("불합격입니다.");
			}
		} else {
			//불합격 처리 부분 (score<60)
			System.out.println("불합격입니다.");
		}
		scan.close();
		
	}
}

		 