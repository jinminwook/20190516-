package mycar;

public class BMW {

	public static void main(String[] args) {
		/*
		 * 연산자 (Operator) 1.산술 연산자 +,-,*,/,%(나머지 연산) ex)5%2 하게되면 =1이다 몫:2 나머지:1 2.부호연산자
		 * - (숫자앞에 붙이면 음수가됨) 3.대입연산자 +=,-=,*=,/= (a+=b =>a=a+b) 4.증감연산자 ++,--
		 * (++변수,변수++) 5.비교연산자 <,>,>=,<=,== :결과값 boolean (*5>2:참=true,5<2:거짓=false)
		 * 6.논리연산자 And=& OR=|| Not=!
		 * 
		 */
		int jin = 20, min = 10;
		System.out.println("곱한값:" + jin * min);
		System.out.printf("더한값 : ");
		System.out.println(jin + min);
		System.out.printf("빼기 : ");
		System.out.println(jin - min);
		System.out.println("나누기연산:" + jin / min);
		System.out.println("나머지연산:" + jin % min);

		String a = "자바";
		String b = "어려워";
		String c = a + b;
		System.out.println(c);

		/*
		 * int wook=jin+min; System.out.printf(wook); String a='자바'; String b='어려워';
		 * String c=a+b; system.out.println(c); int->double :자동 형변환
		 * 
		 */

	}

}
