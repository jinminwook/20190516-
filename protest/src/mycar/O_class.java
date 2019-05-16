package mycar;

import java.util.Scanner;

public class O_class {

	public static void main(String[] args) {

		/*정수를 입력받아 홀수인지 짝수인지를 출력하고.
		 * 0을 입력하면 프로그램이 종료되도록 하세요.
		 */
		int i;//정수형 변수 i선언
		Scanner scan = new Scanner(System.in);//스캐너 문
		System.out.println("숫자를 입력하세요");//처음 출력하는 문장
		System.out.println("종료하시려면 0누르세요.");
		do { // 반복문 do ~ while실행
			i=scan.nextInt(); //정수형 입력
			if(i==0) {//if 문 조건 달기 i값이 0일때 종료
				System.out.println("종료 ㅎ.");//종료 출력
				break; // 반복 멈추기
			}
			System.out.println((i%2==1)? "홀수입니다." : "짝수 입니다.");//삼항방정식  2로 i값을 나누었을때 나머지 값이 홀수면 true 짝수면 false
			
		}while(i!=0);//i의 값이 0이 아닐때 다시 반복한다.
				scan.close(); //스캔 종료
		}
		
	}
