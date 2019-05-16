package mycar;

public class Cadillac {

	public static void main(String[] args) {

		//랜덤 숫자 발생
		int num = (int)(Math.random()*6)+1;
		//switch case 문 사용
		switch(num) {
		case 1://num==1
				System.out.println("1번이 나왔어");
				break;
		case 2:
				System.out.println("2번이 나왔어");
				break;
		case 3:
				System.out.println("3번이 나왔어");
				break;
		case 4:
				System.out.println("4번이 나왔어");
				break;
			
		default://기본이라는 뜻
				System.out.println("다른숫자가 나왔어");
				break;
		
		}
		
		
		
	}

}
