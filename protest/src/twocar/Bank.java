package twocar;

public class Bank {
	/*
	 * ������ ���� ���α׷�
	 * 1.���ο� ���� ����� �� �̸�,���¹�ȣ,�ʱ��Աݾ��� �Է���.
	 * =>�� ��� ����� 2���� ������� ����
	 * 		1.1��ü ������ �Ű������� �����ϱ�
	 * 		1.2 getter,setter �̿��ϱ�
	 * 2.���� ����� ������ �� �ִ�.
	 * 3.��� ����� ����  �� �� �ִ�.
	 * 3.1 �ܾ��� 0�� �̸����� �Ǹ� ��� �Ұ���
	 * 4.�ܾ� Ȯ�� ����� ���� �� �� �ִ�.
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
	//�޼ҵ� ����.
	void chang() {
		chang+=in;
		chang-=out;
		int chang=(this.in);
		System.out.println(name+"�� �ܾ�"+chang+"�� �ֽ��ϴ�.");
	
	}
}
