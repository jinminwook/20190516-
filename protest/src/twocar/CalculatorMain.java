package twocar;

public class CalculatorMain {

	public static void main(String[] args) {
		//Calculator 큻래스의 객체 생성
		Calculator nini = new Calculator();
		System.out.println("메소드 호출 전 ");
		//Calculator 클래스가 가지고 있는 powerOn 메소드 호출
		nini.powerOn();
		System.out.println("메소드 호출 후 ");
		
		//plus 메소드 호출
		int result = nini.plus(1,2);
		System.out.println(result);
		
		
		
		
	}

}
