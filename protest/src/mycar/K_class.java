package mycar;

public class K_class {

	public static void main(String[] args) {

		/*
		 * 무한 반복 문
		 * 주사위를 던져서 6이 나오면 반복문 종료
		 */
		boolean value=true;
		while(value) {
			int num =(int) (Math.random()*6)+1;
			System.out.println("숫자"+num);
			if(num==6) {
				value=false;
		}
		}
		System.out.println("반복문 종료");
		
	}

}
 