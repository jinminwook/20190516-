package mycar;

import java.util.Scanner;

public class U_class {

	public static void main(String[] args) {
		int yes=0;
		int count=0;
		Scanner Scan = new Scanner(System.in);
		System.out.println("1과 100사이의 값을 입력하세요 : ");
		
		int num = (int) (Math.random()*100)+1;
		while(true) {
			yes = Scan.nextInt();
			count++;
			if(yes==num) {
				System.out.println("정답입니다.");
				break;
			}if (yes<num) {
				System.out.println("더 큰 값을 입력하세요.");
			}else {
				System.out.println("더 작은 값을 입력하세요.");
			}
		}
		System.out.println("시도횟수는 " + count + "번 입니다.");
		
		
		
		
		
		
		
		
	}

}
