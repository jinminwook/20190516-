package ex190515;
//Cellphone 클래스의 자식클래스로 선언]
//부모클래스 : CellPhone 클래스
//자식클래스 : DmbcellPhone 클래스
//상속 선언 방법
//자식  클래스이름 extends 부모클래스 이름
public class Dmbcellphone extends Cellphone{// extends 상속시키겠다는 뜻.
	//필드선언
	int channel;
	
	//생성자 선언
	Dmbcellphone(String model,String color,int channel){
		this.model=model;
		this.color=color;
		this.channel=channel;
	}
	//메소드 선언
	void turnOnDmb(){
		System.out.println("채널"+channel+"번 DMB방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel=channel;
		System.out.println("채널"+channel+"번으로 바뀝니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
	
}
