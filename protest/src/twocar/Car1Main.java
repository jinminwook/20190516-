package twocar;

public class Car1Main {

	public static void main(String[] args) {
		Car1 caca=new Car1();
		//Car 클래스 객체 생성
		caca.setGas(5);
		//setGas 메소드 호출. 매개값은 5
		boolean gasState=caca.isLeftGas();
		//isLeftGas 메소드를 호출해서 호출 결과를 gasState 라는 변수에 저장
		//gas 필드값 출력
		System.out.println(caca.gas);
		//run 메소드 호출
		if(gasState) {
			System.out.println("출발");
			caca.run();
		}
		
		
		
		
	}

}
