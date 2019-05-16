package mycar;

public class N_class {

	public static void main(String[] args) {

		/*X,Y는 정수
		4X+5Y=60 이라는 식이있을때
		식이 성립하는 모든 해를 구하시오
		~ 답 X=5,Y=8
		X=10,Y=4
		
		단,x,y는 0이상 10이하의 자연수이다.
		*/
		
		int x,y;
			
			for(x=0;x<=10;x++) {
				
				for(y=0;y<=10;y++) {
					if (4*x+5*y==60) {
						System.out.println("x값은 "+x);
						System.out.println("y값은 "+y);
					}
						
					
					
				} 
			}
		
		
		
		
		
		
	}

}
