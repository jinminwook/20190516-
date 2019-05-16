package twocar;

public class Bank {
	/*
	 * 간단한 은행 프로그램
	 * 1.새로운 고객을 등록할 때 이름,계좌번호,초기입금액을 입력함.
	 * =>고객 등록 방법은 2가지 방법으로 구현
	 * 		1.1객체 생성시 매개변수로 전달하기
	 * 		1.2 getter,setter 이용하기
	 * 2.예금 기능을 수행할 수 있다.
	 * 3.출금 기능을 수행  할 수 있다.
	 * 3.1 잔액이 0원 미만으로 되면 출금 불가능
	 * 4.잔액 확인 기능을 수행 할 수 있다.
	 */
	String name;
	int banknumber;
	int in;
	int out;
	int chang;
	int beng;
	
	Bank(String name,int banknumber,int in,int out){
		this.name=name;
		this.banknumber=banknumber;
		this.in=in;
		this.out=out;
	}
	Bank () {
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBanknumber() {
		return banknumber;
	}
	public void setBanknumber(int banknumber) {
		this.banknumber = banknumber;
	}
	public int getIn() {
		return in;
	}
	public void setIn(int in) {
		this.in = in;
	}
	public int getOut() {
		return out;
	}
	public void setOut(int out) {
		this.out = out;
	}
	public int getChang() {
		return chang;
	}
	public void setChang(int chang) {
		this.chang = chang;
	}
	//메소드 생성.
	void chang() {
		chang+=in;
		chang-=out;
		int chang=(this.in);
		System.out.println(name+"님 잔액"+chang+"원 있습니다.");
	
	}
}
