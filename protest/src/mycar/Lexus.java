package mycar;

public class Lexus {

	public static void main(String[] args) {
/*
 * random() 메소드 : 난수발생 메소드
 * 1~10사이의 숫자 중 하나를 발생시키려면
 * Math.random() : 0.0보다 크거나 같고 1.0보다 작은 실수
 * 0.0<=Math.random() < 1.0
 * 0<=Math.random()*10+1<10
 * 1<=Math.random()*10+1<11
 * 
 */
	//	int randomNumber;
	//	randomNumber =(int)(Math.random()*10)+1; //=>1~10사이의 숫자
	//	System.out.println(randomNumber);
		
	/*주사위 번호 출력 프로그램
		*1~6까지의 난수를 발생시켜서 
		*1이나오면 1번이 나왔습니다.
		*2가 나오면 2번이 나왔습니다.
		**~~~~
		*6이 나오면 6번이 나왔습니다.*/
		
		
		 
	int ran;
	ran=(int)(Math.random()*6)+1;
	System.out.println(ran+"번이 나왔습니다");
	if(ran==6) {
		System.out.println("6번입니다.");
	}
	else if (ran==5) {
			System.out.println("5번입니다.");
	}
	else if (ran==4) {
		System.out.println("4번입니다.");
}
	else if (ran==3) {
		System.out.println("3번입니다.");
}
	else if (ran==2) {
		System.out.println("2번입니다.");
}
	else if (ran==1) {
		System.out.println("1번입니다.");
}
	else
		System.out.println("꽝입니다");
}
		
		
		
		
		
		
		
		
		
	}

