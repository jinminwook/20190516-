package ex190516;
//A클래스 선언
class A{
}
//A클래스의 자식클래스인 B클래스 선언
class B extends A{
	
}
//A클래스의 자식클래스인 C클래스 선언
class C extends A{
	
}
//B클래스의 자식클래스인 D클래스 선언
class D extends B{
	
}
//C클래스의 자식클래스인 E클래스 선언
class E extends C{
	
}
public class Promotion {

	public static void main(String[] args) {
		//B클래스 타입의 변수 b선언
		B b = new B();
		//C클래스 타입의 변수c 선언
		C c = new C();
		//D클래스 타입의 변수 d 선언
		D d = new D();
		//E클래스 타입의 변수 e 선언
		E e = new E();
		
		//각 클래스 타입으로 선언한 변수들의
		//자동 형변환 가능 여부 확인
		//A클래스 타입 변수 a1에 B클래스 타입의 변수 대입
		A a1=b;
		//A클래스 타입 변수 a2에 C클래스 타입의 변수 대입
		A a2=c;
		//A클래스 타입 변수 a3에 D클래스 타입의 변수 대입
		A a3=d;
		//A클래스 타입 변수 a4에 E클래스 타입의 변수 대입
		A a4=e;
		//A클래스 타입 변수 b1에 D클래스 타입의 변수 대입
		A b1=d;
		//A클래스 타입 변수 c1에 E클래스 타입의 변수 대입
		A c1=e;
		//A클래스 타입 변수 b2에 E클래스 타입의 변수 대입
		A b2=e;
		//A클래스 타입 변수 c2에 D클래스 타입의 변수 대입
		A c2=d;
		//A클래스 타입 변수 b3에 A클래스 타입의 변수 대입
		A b3=(B) a1;
	
	}

}
