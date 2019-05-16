package twocar;

public class Calculator {
	
	//메소드 선언(리턴없고,매개변수 없음.)
	
	void powerOn() {//리턴 타입 보이드.(리턴이없음)
		System.out.println("전원을 켭니다.");
	}
	//메소드 선언(리턴,매개변수 존재)
	//리턴타입이 존재한다는 것은 메소드 호출이 끝나면
	//호출한 지점으로 넘겨주는 값이 존재한다는 것
	int plus(int x,int y) {
		int result=x+y;
		return 10;
	}
	
	//곱셈,뺄셈,나눗셈 메소드를 각각 정의하고
	//Calculator 클래스에서 호출하여 사용해보세요.
}
