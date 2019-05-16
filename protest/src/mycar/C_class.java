package mycar;



public class C_class {

	public static void main(String[] args) {

		
		
		//2단계 1부터 100까지 숫자 중에서 3의 배수 합을 출력하세요
		int sum=0;//합계용 변수
		for(int i=1;i<=100;i++) {//반복변수
			
			
			if(i%3==0) {//3의 배수 조건 : 3으로 나눴을때 나머지가 0
				System.out.println("3의 배수: "+ i);
				sum=sum+i;
				
			}else {
				
			}
			
			
		}
		System.out.println("3의 배수 총합 : "+ sum);
			
		
		
		
		
		
		
		
		
	}

}
