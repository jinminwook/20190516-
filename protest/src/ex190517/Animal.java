package ex190517;

public abstract class Animal {
	
	
	//필드 선언
	public String kind;
	//생성자 선언
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//추상 메소드 선언
	public abstract void sound();
}
