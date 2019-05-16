package ex190516;

public class Point {
	//A.정수형 필드를 2개 가짐.
	int ka;
	int kaka;
	//B.set 메소드
	//i.2개의 매개변수를 전달받아 필드값으로 세팅함.
	void set(int ka,int kaka) {
		this.ka = ka;
		this.kaka=kaka;
		
	}
	//showpoint 메소드
	//C.2개 필드값을 출력하는 print문 있음.
	void showpoint() {
		
		System.out.println(ka);
		System.out.println(kaka);
	}
}
