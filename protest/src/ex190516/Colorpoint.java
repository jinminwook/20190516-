package ex190516;

import java.util.Set;

public class Colorpoint  extends Point{//point의 자식클래스
	
	//A.String 필드 1개 가짐.
	String na;

	//B.setColor 메소드
		//i.1개 매개변수를 전달받아 필드 값으로 세팅함.
	void setColor(String na){
		this.na =na;
	}
	//showColorpoint 메소드
	void showColorPoint(){
		System.out.println(na);
		showpoint();//부모가 가지고있는 메소드 호출//재정의 하기 전에 메소드를 호출할때 super를 쓴다.
	}
	//i.필드값 출력하는 print문
	//ii.showpoint 메소드 호출함.
	
}
