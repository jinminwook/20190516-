package mycar;

public class Nissan {

	public static void main(String[] args) {
		//1~10까지의 합을 출력하는 프로그램
		int sum=0;
		for(int i=1;i<=10000;i++){
			sum=sum+i;
			System.out.println("sum변수값"+sum);
			System.out.println(" i 변수값"+i);
		}
		System.out.println("총합"+sum);
	}

}
