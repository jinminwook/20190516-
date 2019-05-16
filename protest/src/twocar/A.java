package twocar;

public class A {
	//필드 선언
	public int field1;
	int field2;
	private int field3;
	//생성자 선언
	public A() {
		field1=1;
		field2=1;
		setField3(1);
		method1();
		method2();
		method3();
	}
	//메소드 선언
	public void method1() {}
	void method2() {}
	private void method3() {}
	public int getField3() {
		return field3;
	}
	public void setField3(int field3) {
		this.field3 = field3;
	}
	
	/*
	 * 접근 제한자
	 * 1.public
	 * 		  -적용대상:클래스,필드,생성자,메소드
	 * 		  -모든 클래스에서 접근 가능
	 * 2.protected
	 * 	-적용대상 : 필드,생성자,메소드
	 * 	-자식클래스가 아닌 다른 패키지에 소곡되어 있으면 접근불가능
	 * 3.default
	 * 	-적용대상 :클래스,필드,생성자,메소드
	 * 	-다른 패키지에 소속된 클래스는 접근 불가능
	 * 4.private
	 * 	-적용대상 : 필드,생성자,메소드
	 * 	-자신이 아닌 다른 클래스에서는 접근 불가능
	 *  
	 */
}
