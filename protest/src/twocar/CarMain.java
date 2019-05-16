package twocar;

public class CarMain {

	public static void main(String[] args) {

		//객체 생성
		//1.기본생성자를 호출하여 객체 생성
		Car mycar1=new Car();
		//2.model을 매개변수로 하는 생성자를 호출하여 객체 생성
		Car mycar2=new Car("S클래스");
		System.out.println(mycar2.model);
		//3.medel,color를 매개변수로 하는 생성자 호출하여 객체 생성
		Car mycar3=new Car("E클래스","흰색");
		System.out.println(mycar3.model);
		//4.model,color,maxSpeed를 매개변수로 하는 생성자 호출하여 객체 생성
		System.out.println(mycar3.color);
		//각 객체의 필드값 출력
		Car mycar4=new Car("C클래스","검은색",300);
		System.out.println(mycar4.model);
		System.out.println(mycar4.color);
		System.out.println(mycar4.maxSpeed);
	}

}
