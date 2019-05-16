package mycar;

import java.util.Scanner;

public class Chevrolet {

	public static void main(String[] args) {

		/*점수를 스캔으로 입력받아서
		 * 90~100점이면 A
		 * 80~89점이면 B
		 * 70~79점이면C
		 * 60~69점이면D
		 * 60점 미만이면 F를 출력하는 프로그램.
		 */
		int score;
		Scanner scan = new Scanner(System.in);
		System.out.print("당신의 점수는 몇 점입니까?");
		score=scan.nextInt();
		
		if(score>=90) {
			System.out.println("당신의 등급은 A 입니다.");
		}
		else if (score>=80) {
			System.out.println("당신의 등급은 B 입니다");
		}
			else if (score>=70) {
				System.out.println("당신의 등급은 C 입니다");
			}
				else if (score>=60) {
					System.out.println("당신의 등급은 D 입니다");
				}
					else{
			System.out.println("당신은..답이없네요 환생하세요.");
		}
		
		
		System.out.println();
		
		
		
		
		
	}

}
