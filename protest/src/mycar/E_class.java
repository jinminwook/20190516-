package mycar;

import java.util.Scanner;

public class E_class {

	public static void main(String[] args) {
		
		
		int start,end;
		int sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("���۰��� �Է��ϼ���");
		start=scan.nextInt();
		System.out.println("������ �Է��ϼ���");
		end=scan.nextInt();
		
		for(int i=start;i<=end;i++) {
			
			sum+=i;
			System.out.print((i<end)? i+"+" : i+"=" );
			
		}
		System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
