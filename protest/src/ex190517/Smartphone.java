package ex190517;
//추상클래스인 Phone 클래스 상속
public class Smartphone extends Phone{
	//생성자 선언
	Smartphone(String owner){
		super(owner);
	}
	//메소드 선언
	public void internetSearch() {
		System.out.println("인터넷 검색");
	}
}
