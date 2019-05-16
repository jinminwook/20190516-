package ex190516;

public class CarMain {

	public static void main(String[] args) {

		
		//a.sedan,truck에 대한 객체 각각 생성
		Sedan nana = new Sedan(100,"빨간색");
		nana.Color="빨간색";
		Truck nene = new Truck(60,"은색",5);
		nene.Color="검은색";
		//b.sedan의 속도를 200,truck의 속도를 100으로 올림.
		nana.sp(100);
		nene.sp(40);
		
		//c.sedan의 좌석수를 5 truck의 적재량을 5로 설정.
		nana.setSeatNum(5);
		//d.출력문
		//1.빨간색 승용차의 속도는 200이고 좌석수는 5개 입니다.
		System.out.println(nana.Color+" 승용차의 속도는 "+nana.speed+" 이고 좌석수는 "+nana.getSeatNum()+"개 입니다.");
		//2.검정색 트럭의 속도는 100이고 적재량은 5톤입니다.
		System.out.println(nene.Color+" 트럭의 속도는  "+nene.speed+" 이고 적재량은"+nene.getCapacity()+"톤 입니다.");
	}

}
