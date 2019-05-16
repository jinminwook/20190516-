package twocar;

import java.util.Scanner;

public class ExeriseMainMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		/*
		 * 학생의 이름,국어,영어,점수를 입력받아
		 * 평균 점수가 70이상이면 합격
		 * 70미만이면 불합격을 출력하는 프로그램을 작성하시오.
		 * 
		 * 이름,국어,영어 점수를 필드값으로 지정하는 방법은 총 2가지로 해서 구현
		 * 1.생성자를 활용하기
		 * 2.get,set 메소드 활용하기
		 * 
		 * 합격 불합격은 result라는 메소드를 사용하도록.
		 */
		//1.번 방법 이용해서 구현
		System.out.print("이름");
		String name =scan.next();
		System.out.print("국어점수");
		int kor = scan.nextInt();
		System.out.print("영어점수");
		int eg = scan.nextInt();
		
		ExeriseMain stu =
				new ExeriseMain(name,kor,eg);
		stu.result();
		//1번 방법을 이용해서 구현
		System.out.println("------1번 방법 끝 ------");
		//매개변수가 있는 생성자를 이용하여 객체 생성
		//매개변수 name,kor,eg
		System.out.println("------2번 방법 시작 ------");
		
		
		//2.번 방법 이용해서 구현
		ExeriseMain stu1 =new ExeriseMain();
		//getter,setter 메소드를 이용하여 필드값 지정
		stu1.setName(name);
		stu1.setKor(kor);
		stu1.setEg(eg);
		stu1.result();
		System.out.println("------2번 방법 끝 ------");
	}

}
