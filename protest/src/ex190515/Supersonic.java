package ex190515;

public class Supersonic extends Airplane {
	//NORMAL,SUPERSONIC �̶�� ������ ��� ����
	public static final  int NORMAL=1;
	public static final  int SUPERSONIC=2;
	public int flymode = NORMAL;
	
	//fly �޼ҵ� ������
	@Override
	public void fly() {
		if(flymode ==SUPERSONIC) {
			System.out.println("SupersonicPlane �����Ӻ���");
		}else {
			//�����ǰ�  �ȵ� �θ�Ŭ������ fly �޼ҵ� ȣ��
			super.fly();
		}
	}
	
	
}
