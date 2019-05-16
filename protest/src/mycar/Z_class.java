package mycar;

import java.util.Scanner;

public class Z_class {

	public static void main(String[] args) {

		/*
		 * 1.크기가 3인 정수형 배열 선언
		 * 2.스캐너를 이용하여 값을 3개입력
		 * 3.입력된 값의 총합,평균계산
		 */
		int[] asd =new int [3];
		int sut,hap=0;
		int sum=0;
		Scanner scan = new Scanner(System.in);
//		sut=scan.nextInt();
//		ja=scan.nextInt();
//		hap=scan.nextInt();
//		sum+=sut+ja+hap;
//		System.out.println("3개의 합 "+sum);
//		System.out.println("3개의 평균 "+sum/asd.length);
		
		for(int i =0;i<asd.length;i++) {
			sut=scan.nextInt();
			sum+=sut;
			hap=sum/asd.length;
		}System.out.println("합"+sum);
		System.out.println("평균"+hap);
		}
	}


