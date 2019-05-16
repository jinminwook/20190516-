package mycar;

public class CC_class {

	public static void main(String[] args) {

		/*
		 * 다차원 배열
		 * : 2차원 이상의 배열
		 * : 행x열 로 표현 ) [2][3] :2행 3열   가로줄 행 세로줄 열 :총 6개의 방.
		 * : 예를들어 2행3열 배열은 총 6개의 데이터 가짐.
		 */
		//2차원 배열 선언
		//정수형의 2행3열짜리 배열
		int[][] score = new int[2][3];
		score[1][1]=10;
		//배열의 크기 확인
		System.out.println(score.length);//행의 갯수가 나온다.
		System.out.println(score[0].length);//각 행에대한 열의 갯수
		
		//배열의 초기값 확인
		//중복 for 문을 이용하여[0][0]~[1][2] 까지 값 확인
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.println("score["+i+"]["+j+"]"+"="+score[i][j]);
			}
		}
		
		
		//초기값을 저장하면서 2차원 배열 선언하기.
		int[][] values= {{1,2,3},{4,5,6}};
		for(int i=0;i<values.length;i++) {
			for(int j=0;j<values[i].length;j++) {
				System.out.println("score=["+i+"]["+j+"]="+values[i][j]);
			}
		}
		
		String[][] uri ={{"진민욱","신동혁","현도현","김강인"},{"김재휘","이소현","양우혁",}};
		for(int h=0;h<uri.length;h++) {
			for(int g=0;g<uri[h].length;g++) {
				System.out.println(uri[h][g]);
			}
		}
		
	}

}
