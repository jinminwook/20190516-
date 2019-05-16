package mycar;

import java.util.Scanner;

public class Toyota {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		int score;
		System.out.println("점수 몇점?");
		score = scan.nextInt();
		String A;
		if(score>100) {
			System.out.println("그런 점수는 없어.");
		}
		else {
			if(score>=95) {
				A="A+";
			}
			else if(score>=90) {
				A="A";
			}			
			else if(score>=85) {
				A="B+";
			}
			else if(score>=80) {
				A="B";
			}
			else if(score>=75) {
				A="C+";
			}
			else if(score>=70) {
				A="C";
			}
			else if(score>=65) {
				A="D+";
			}
			else if(score>=60) {
				A="D";
			}
			else {
				A="F";
			}
			scan.close();
			System.out.println("당신의 학점은"+A+"입니다");
		}
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

