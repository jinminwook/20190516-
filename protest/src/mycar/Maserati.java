package mycar;

public class Maserati {

	public static void main(String[] args) {
			/* 증감 연산자
			 * 형식:++,--
			 * 변수앞에 ++을 쓰면 변수가 가지고 있는 값에 1을 증가시킨 뒤 연산에 사용함.
			 * 변수 뒤에 ++을 쓰면 변수가 가지고있는 값을 일단연산에 사용한 뒤 변수 값을 1증가시킴.
			 * 제어문 for 문 에 많이 사용함 (반복문)
			 * 
			 */
		int x=10;
		int y=10;
		int z;
		System.out.println("x++ 수행 전 " + x);
		x++;
		System.out.println("x++ 수행 후 " + x);
		
		System.out.println("++x 수행 전 " + x);
		++x;
		System.out.println("x++ 수행 후 " + x);
		
		System.out.println("y 값 " + y);
		y--;
		System.out.println("y 값 " + y);
		--y;
		System.out.println("y 값 " + y);
		//x=12 y=8 z=
		z=x++;//현재 x값인 12를 z 에 대입한 후 x의 값을 1증가시킴
		System.out.println("z 값 " + z);
		System.out.println("y 값 " + y);
		//x=13 y=8 z=12
		
		z=++x;
		System.out.println("z 값 " + z);
		System.out.println("y 값 " + x);
		//x=14 y=8 z=14
		z=++x + y++;
		System.out.println("z 값 " + z);
		System.out.println("x 값 " + x);
		System.out.println("y 값 " + y);
		
	}

}
