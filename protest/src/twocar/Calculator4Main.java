package twocar;

public class Calculator4Main {

	public static void main(String[] args) {//정적 메소드임.
		//static 필드 사용
		//객체 접근이 아닌 클래스로 직접 접근
		Calculator4 nana = new Calculator4();
		System.out.println(nana.pi);
		//static 메소드 사용
		Calculator4.plus(10, 20);
		//상수 사용
		System.out.println(Calculator4.EARTH_RADIUS);
		//상수를 이용하여 지구 넓이 구하기
		double earthArea = Calculator4.EARTH_RADIUS*
				Calculator4.EARTH_RADIUS*Math.PI;//Math.pi는 자바에서 기본적으로 제공 해주는 파이 값.
		System.out.println("지구넓이 :"+earthArea);
	}

}
