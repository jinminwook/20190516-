package twocar;

public class KeyTurnOn {
	String start ="�õ��� �մϴ�.";
	int sp; // �ʵ尪
	//int nowsp;
	void setsp(int sp) { // ���⿡ �ִ�int�� �Ű�����
		this.sp=sp; // �ʵ�� �Ű����� �̸��� ���Ƽ� this�� ����
		//this.nowsp=this.sp;
	}
	boolean speed=true;
	void run() {
		while(speed) {
			if(sp<50) {
				System.out.println("�ü� :"+sp+"km/h");
				sp+=10;
			}else if(sp==50){
				System.out.println("�ü� :"+sp+"km/h");
				System.out.println("���� �ӵ�"+sp);
				return;
			}
			}
		}
	
}

	
	
	
	
	

