package ex190515;

public class ComputerMain {

	public static void main(String[] args) {
		
		/*
		 * Calculator,Computer 클래스에 대한 객체를
		 * 각각 선언하여 circleArea 메소드를 각각 호출 후
		 * 결과를 출력하시오.
		 */
		//Calculator 객체 선언
		Calculator nana =new Calculator();
		Computer nene = new Computer();
		
		nana.circleArea(5);
		nene.circleArea(7);
		System.out.println(nana.circleArea(5));
		System.out.println(nene.circleArea(7));
		
		
		
	}

}
