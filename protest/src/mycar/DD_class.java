package mycar;

public class DD_class {

	public static void main(String[] args) {

		/*
		 * 학점이 아래와 같을 때 전체 평점 계산.
		 * 학년   1학기 2학기
		 * 1학년 1.9  2.5
		 * 2학년 3.5  3.8
		 * 3학년 4.1  4.2
		 * 4학년 4.4  4.3
		 */
		double[][] jum={{1.9,3.5,4.1,4.4},{2.5,3.8,4.2,4.3}};
		double sum=0;
		double avg=0;
		for(int i=0;i<jum.length;i++) {
			for(int j=0;j<jum[i].length;j++) {
				System.out.print(jum[i][j]+" ");
				sum+=jum[i][j];
				avg=sum/(jum[i].length*jum.length);
			}
		}System.out.print("총합"+sum);
		System.out.print("평균"+avg);
		
		
		
		
		
	}

}
