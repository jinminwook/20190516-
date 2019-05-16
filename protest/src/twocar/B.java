package twocar;

import mycar.AA_class;

public class B {
	//A클래스 타입의 변수 a 선언
//	A a;
	B(){
		
	
	//A클래스에 대한 객체 생성
	A a = new A();
	//객체를 통한 A클래스의 필드 및 생성자 접근해보기
	a.field1 =10;
	a.field2 =20;
	a.field3(30);
	//메소드 호출
	a.method1();
	a.method2();
	a.method3();
	}
}
