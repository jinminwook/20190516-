package ex190515;

public class DmbcellphoneMain {

	public static void main(String[] args) {

		//DmbCellphone 클래스에 대한 객체 생성
		Dmbcellphone nana= new Dmbcellphone("OCN","Red",23);
		//model,color,channel 필드값 각각 출력
		System.out.println(nana.model);
		System.out.println(nana.color);
		System.out.println(nana.channel);
		
		//부모클래스가 가지고있는 메소드 각각 호출
		nana.powerOn();
		nana.powerOff();
		nana.bell();
		nana.sendVoice("님");
		nana.receiveVoice("뭐요");
		nana.hangUp();
		//자식클래스가 가지고있는 메소드 각각 호출
		nana.turnOnDmb();
		nana.changeChannelDmb(11);
		nana.turnOffDmb();
		
		
		
		
		
		
		
	}

}
