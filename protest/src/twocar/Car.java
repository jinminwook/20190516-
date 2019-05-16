package twocar;

public class Car {
//필드선언
	String company = "벤츠";
	String model;
	String color;
	int maxSpeed;

	
	
	/*여러종류의 생성자를 선언
	 * 1.기본생성자
	 * 2.model을 매개변수로 하는 생성자
	 * 3.medel,color를 매개변수로 하는 생성자
	 * 4.model,color,maxSpeed를 매개변수로 하는 생성자
	 * 
	 * 각 생성자를 만들고 CarMain 클래스에서
	 * 각 생성자를 호출하여 객체를 만들어 필드값 출력
	 * 
	 */
	Car(){
		
	}
	Car(String model){
		this.model=model;
	}
	Car(String model,String color){
		this.model=model;
		this.color=color;
	}
	Car(String model,String color,int maxSpeed){
		this.model=model;
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
}
