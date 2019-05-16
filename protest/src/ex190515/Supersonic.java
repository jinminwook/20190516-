package ex190515;

public class Supersonic extends Airplane {
	//NORMAL,SUPERSONIC 이라는 정수형 상수 선언
	public static final  int NORMAL=1;
	public static final  int SUPERSONIC=2;
	public int flymode = NORMAL;
	
	//fly 메소드 재정의
	@Override
	public void fly() {
		if(flymode ==SUPERSONIC) {
			System.out.println("SupersonicPlane 초음속비행");
		}else {
			//재정의가  안된 부모클래스의 fly 메소드 호출
			super.fly();
		}
	}
	
	
}
