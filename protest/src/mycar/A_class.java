package mycar;

import java.util.Scanner;

public class A_class {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int first,end;
		int sum=0;
		int i=0;
		System.out.println("시작 값을 작성 하세요");
		first=scan.nextInt();
		System.out.println("끝 값을 작성 하세요");
		end=scan.nextInt();
		for(i=first;i<=end;i++) {		// i=1 e=3
			sum+=i;							//sum= 0+1 =1		sum=3 sum=6
			System.out.println(i);				//i=1 i=2 i=3
			if(i<=(end-1)) {
				System.out.println("+");	// i =1  1+2+3=sum
			}
			else {
				System.out.println("=");
				System.out.println(sum);
			}
		}
		System.out.println(i);
		scan.close();
		
		
		
	}

}
