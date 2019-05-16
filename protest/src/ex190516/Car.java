package ex190516;

public class Car {
		
	
	//a.색,속도를 담을 수 있는 필드.
		String Color;
		public int speed;
		
		Car(int speed,String color){
			this.speed=speed;
			this.Color=color;
		}
	//b.속도 증가 처리용메소드 (단순 덧셈만)
	void sp(int speed) {
		this.speed+=speed;
		
	}
	//c.속도 감소 처리용 메소드(단순 뺄셈만)
	void lsp(int speed) {
		speed-=speed;
	}
}
