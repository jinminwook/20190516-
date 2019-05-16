package ex190516;

public class Sedan extends Car{//Car 클래스의 자식클래스
		
	//a.좌석수를 담을 수  있는 필드
	int seatNum;
	

	//생성자 선언
	Sedan(int speed,String color){
		super(speed,color);
	}
	//b.메소드선언 (getter,setter)
	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	
}
