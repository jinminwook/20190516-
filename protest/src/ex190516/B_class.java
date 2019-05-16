package ex190516;

public class B_class {
	public void method() {
	
	
	//A클래스의 객체 생성
	A_class nana = new A_class();
	//A클래스의 필드값 주기
	nana.field = "아무값";
	//A클래스의 메소드 호출
	nana.method();
	}
	/*
	 * 1.다른 패키지에 C,D 클래스를 선언.
	 * 2.D클래스는 A 클래스의 자식클래스로 선언
	 * 3.D클래스
	 * 		3.1 A클래스의 생성자 호출
	 * 		3.2	A클래스의 필드값 주기
	 * 		3.3	A클래스의 메소드 호출
	 * 4.C클래스안에 메소드 하나 선언해서 그 안에 
	 * 		4.1	A클래스 객체로 선언
	 * 		4.2	A클래스의 필드값 주기
	 * 		4.3	A클래스의 메소드 호출
	 */
	
}
