package mycar;

public class X_class {

	public static void main(String[] args) {

		/* 
		 * 배열 선언시 값은 주지 않고
		 * 배열 크기만 선언
		 */
		//크기가 3이고 numbers라는 배열 변수 선언
		int[] numbers = new int[3];
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		//크기가 3인 double,String 배열 변수 선언 해보기.
		double[] sam = new double[3];
		String[] sem = new String[3];
		for(int j=0;j<sam.length;j++) {
			System.out.println(sam[j]);
		}
		for(int p=0;p<sem.length;p++) {
			System.out.println(sem[p]);
		}
		
		//numbers에 값 저장하기
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		sam[0]=1;
		sam[1]=2;
		sam[2]=3;
		for(int j=0;j<sam.length;j++) {
			System.out.println(sam[j]);
		}
		sem[0]="1";
		sem[1]="2";
		sem[2]="3";
		for(int p=0;p<sem.length;p++) {
			System.out.println(sem[p]);
		}
	}
	
}
	