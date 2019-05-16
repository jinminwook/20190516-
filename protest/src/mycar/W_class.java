package mycar;

public class W_class {

	public static void main(String[] args) {

		/*
		 * 배열 (Array)
		 * 여러개의 데이터를 담는 변수
		 * 정수타입 배열 : 정수  int
		 * 문자타입 배열 : 문자  String
		 * 
		 * 
		 */
		
		//배열 선언 하기
		int[] scores= {90,95,80};
		String[] str = {"[진민욱]","[신동혁]","[현도현]","[김강인]"};
		//        index[0][1][2] =배열크기(길이):3 방이 총 몇개?
		//배열 인덱스:2  방 번호가 몇번 까지 갔느냐?
		
		//배열의 각 요소에 접근해서 값 출력하기.
		//scores[0]
		
		System.out.println("scores[0]의 값 :"+scores[0]);
		System.out.println("scores[1]의 값 :"+scores[1]);
		System.out.println("scores[2]의 값 :"+scores[2]);
		
		System.out.println(str.length);//문자배열의 길이 출력
		System.out.println("우리 조 이름  : "+str[0]+str[1]+str[2]+str[3]);
		
		for(int i=0; i < str.length; i++) {
			System.out.println(str[i]);
			
			/*	System.out.println(str[0]);
				System.out.println(str[1]);
				System.out.println(str[2]);
				System.out.println(str[3]);
			*/
			
			
		}
		
		
		for(int j = 0;j<scores.length;j++) {
			
			System.out.println("scores["+j+"]의 값 :"+scores[j]);
			
			
		}
		
		//scores 배열의 요소 값을 모두 더해서 평균 구하기.
		int[] k= {90,95,80};
		int sum=0;
		for(int o=0;+o<k.length;o++) {
		sum+=k[o];
		}System.out.println("더한 값 :"+sum);
		System.out.println("더한 값 :"+sum/k.length);
		
		
		
	}

}
