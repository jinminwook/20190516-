package mycar;

public class HH_class {

	public static void main(String[] args) {

		/*
		 * 향상된 for문 (advanced for)
		 * for each문 
		 */
		int[] scores= {90,80,50,60,100};
		int sum=0;
		for(int score : scores) {
			sum+=score;
			
		}System.out.println(sum);
		
		//String 배열 변수를 선언해서
		//for each 를 이용하여 변수에 담긴 데이터를 모두 출력
		
		String[] name = {"진민욱","신동혁","현도현","김강인"};
		for(String mimi : name) {
			System.out.println(mimi);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
