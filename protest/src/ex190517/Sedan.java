package ex190517;

public class Sedan extends Car {

	Sedan(String Color, int Speed) {
		super(Color, Speed);
		this.jim();
		
	}
	@Override
	void jim() {
		System.out.println(this.color+"Sedan은"+"사람을 실을 수 있다."+"속도는"+this.Speed+"속도로 달리는중입니다.");
	}
	
}
