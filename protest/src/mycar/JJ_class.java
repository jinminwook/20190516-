package mycar;

import java.util.Scanner;

public class JJ_class {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = null;
		int sum=0;
		double phyung=0;
		int max=0;
		int score=0;
		boolean choice=true; 
		while (choice) {
			System.out.println("----------------------------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택>");
			
			int sun = scan.nextInt();
			if(sun==1) {
				System.out.println("학생수>");
				int hak = scan.nextInt();
				num = new int [hak];
			}if (sun==2) {
				for(int i=0;i<num.length;i++) {
					System.out.println(i+1+"번 째 학생 점수>");
					num[i] = scan.nextInt();
				}
			}else if(sun==3) {
				for(int j=0;j<num.length;j++) {
					System.out.println(j+"번 째 학생점수>"+num[j]);
				}
				
			}else if(sun==4) {
				for(int k=0;k<num.length;k++) {
					sum+=num[k];
					phyung=sum/num.length;
					if(max<num[k]) {
						max=num[k];
						/*
						 * 입력된 값 중 최댓값,평균값 출력
						 * 1.최댓값 출력
						 * 1.1최댓값 출력을 위한 변수
						 * 1.2최댓값을 찾는 방법??
						 * =>비교문을 이용??
						 * 2. 평균값 출력
						 * 2.1 평균을 구하기 위해서는 합계 값이 필요
						 * 2.2 합계값은 어떻게??
						 * 2.3 평균값 출력을 위해 변수를 선언
						 */
					}
				}
				System.out.println("평균점수"+phyung);
				System.out.println("최고점수"+max);
				
			}else if(sun==5) {
				//while 문 종료
				System.out.println("종료합니다.");
				choice = false;
			}
				
		}
	}

}
