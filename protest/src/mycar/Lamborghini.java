package mycar;

public class Lamborghini {

	public static void main(String[] args) {
		/*대입연산자
		 +=,-=,*=,/=,%=
		 * a += b => a = a + b
		 */
		int jin=20,min=10;
		jin+=min;
		System.out.println("+연산:"+jin);
		jin-=min;
		System.out.println("-연산:"+jin);
		jin*=min;
		System.out.println("*연산:"+jin);
		jin/=min;
		System.out.println("/연산:"+jin);
		jin%=min;
		System.out.println("%연산:"+jin);
		
		 
		boolean value1=true;
		System.out.println(value1);
		
		value1=!value1;
		System.out.println(value1);
		
		value1=!value1;
		System.out.println(value1);
		
		boolean boolResult = true;
		boolResult = true&&true;
		System.out.println("AND 연산:" + boolResult);
		boolResult = true&&false;
		System.out.println("AND 연산:" + boolResult);
		boolResult = true||false;
		System.out.println("OR 연산:" + boolResult);
		boolResult = true||true;
		System.out.println("OR 연산:" + boolResult);
		
		/* 삼항 연산자
		 * 형식:
		 * (조건식)? 조건이 true 일때 결과 : false 일때 결과
		 
		 	 */
		int score = 80;
		String grade;
		//삼항연산자 사용
		grade =(score != 80)? "A" : "B";
		System.out.println("grade 변수 값 : " + grade);
		
		
		
		
	}

}
