package ex190516;

public class Car {
		
	
	//a.��,�ӵ��� ���� �� �ִ� �ʵ�.
		String Color;
		public int speed;
		
		Car(int speed,String color){
			this.speed=speed;
			this.Color=color;
		}
	//b.�ӵ� ���� ó����޼ҵ� (�ܼ� ������)
	void sp(int speed) {
		this.speed+=speed;
		
	}
	//c.�ӵ� ���� ó���� �޼ҵ�(�ܼ� ������)
	void lsp(int speed) {
		speed-=speed;
	}
}
