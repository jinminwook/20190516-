package mycar;

public class CarMain {

	public static void main(String[] args) {
		//기본생성자를 이용한 car라는 이름의 객체선언
		Car Car = new Car();
		//매개변수 String color,int cc를 이용한
		//car2 라는이름의 객체 선언
		Car Car2=new Car("검정",3000);
		
		System.out.println(Car2.ccField);
		System.out.println(Car2.colorField);
		System.out.println(Car.ccField);
		System.out.println(Car.colorField);
		
		
//		//Car클래스에 대한 객체 생성
//		Car Audi = new Car();
//		//객체 추가 선언
//		Car Audi2= new Car();
//		
//		
//		//car 클래스에 선언한 필드값 사용
//		//객체이름.필드명
//		System.out.println(Audi.color);
//		System.out.println(Audi.company);
//		System.out.println(Audi.maxSpeed);
//		System.out.println(Audi.model);
//		System.out.println(Audi.speed);
//		
//		//필드값 변경
//		Audi.speed = 100;
//		System.out.println(Audi.speed);
//		//car2의 speed 필드값 확인
//		System.out.println(Audi2.speed);
		
		
		
	}

}
