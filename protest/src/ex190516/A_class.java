package ex190516;

public class A_class {
	/*
	 * protected 접근 제한자
	 *  :자식클래스가 다른 패키지에 소속된 경우 접근가능
	 *  :하지만 일반 클래스는 접근 불가능
	 *  :필드,생성자,클래스에 모두 사용 가능
	 */
	//protected 접근 제한을 갖는 필드 (field),생성자,메소드 선언(method)
	//필드 선언
	protected String field;
	//생성자 선언
	public A_class() {
		
	}
	//메소드 선언
	protected void method() {
		
	}
	
}
