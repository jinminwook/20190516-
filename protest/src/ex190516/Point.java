package ex190516;

public class Point {
	//A.������ �ʵ带 2�� ����.
	int ka;
	int kaka;
	//B.set �޼ҵ�
	//i.2���� �Ű������� ���޹޾� �ʵ尪���� ������.
	void set(int ka,int kaka) {
		this.ka = ka;
		this.kaka=kaka;
		
	}
	//showpoint �޼ҵ�
	//C.2�� �ʵ尪�� ����ϴ� print�� ����.
	void showpoint() {
		
		System.out.println(ka);
		System.out.println(kaka);
	}
}
