package ex190516;

public class ColorPointMain {

	public static void main(String[] args) {
		//A.point 클래스 객체로 만들어서 set,showPoint 메소드 호출
		
		Point iaia = new Point();
			iaia.set(10, 20);
			iaia.showpoint();
		//B.ColorPoint 클래스 객체로 만들어서 set,setColors,showColorPoint 메소드 호출
		Colorpoint uaua = new Colorpoint();
		uaua.set(1,2);
		uaua.setColor("댄디블루");
		uaua.showColorPoint();
		
	}

}
