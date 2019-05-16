package twocar;

public class KeyTurnOn {
	String start ="시동을 켭니다.";
	int sp; // 필드값
	//int nowsp;
	void setsp(int sp) { // 여기에 있는int는 매개변수
		this.sp=sp; // 필드와 매개변수 이름이 같아서 this를 적용
		//this.nowsp=this.sp;
	}
	boolean speed=true;
	void run() {
		while(speed) {
			if(sp<50) {
				System.out.println("시속 :"+sp+"km/h");
				sp+=10;
			}else if(sp==50){
				System.out.println("시속 :"+sp+"km/h");
				System.out.println("현재 속도"+sp);
				return;
			}
			}
		}
	
}

	
	
	
	
	

