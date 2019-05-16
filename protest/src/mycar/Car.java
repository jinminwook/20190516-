package mycar;

public class Car {
	String company = "현대 자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 300;
	int speed;
	/*클래스 3요소
	 *1.필드(field)
	 *=>데이터를 저장하는 공간
	 *2.생성자(constructor)
	 *=>객체를 만들때 따라야 하는 규칙을 정의
	 *=>객체 생성을 도와주는 블록
	 *=>객체 생성시 필요한 매개변수를 규정함.
	 *=>매개변수가 있을수도 없을수도 있다.
	 *=>매개변수가 없으면 : 기본생성자
	 *=>생성자의 이름은 클래스 이름과 동일함.
	 *3.메소드 (method)
	 *=>특정 기능을 정의한 블록
	 *=>매개변수 있을수도 없을수도 있다.
	 *=>메소드가 호출되면 자신이 가지고 있는 기능을 수행함.
	 *=>기능 수행이 끝나면 리턴값이 존재한다.
	 *필드,메소드,생산자
	 *필드 선언
	 */
	//필드선언
	String colorField;
	int ccField;
	//기본 생성자
	Car(){
		
	}
	//매개변수가 있는 생성자 선언
	Car(String color,int cc){
		colorField = color;
		//colorField = "검정";
		ccField = cc;
		//ccField - 3000;
	}	
	
}
