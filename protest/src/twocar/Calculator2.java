package twocar;

public class Calculator2 {
	int plus(int x,int y) {//������ �Ű� ���� x,y ����
		int result=x+y;//�Ű� ������ �� result
		System.out.println("�հ� :"+result);
		return result;//result ���� ���������� �����Ѵ�. 
	}
	double avg(int x,int y){//��ձ��Ҷ��� �Ҽ��� ���;��ؼ� ����Ÿ�� �����ϰ� ������ �Ű����� x,y ����
		double sum =plus(x,y);//�������ϴ� ���� sum ����, ���� �����ߴ� plus ����.
		double result = sum /2;//result ������ plus�� ���ԵǾ��� sum������ ������ ����� ����.
		System.out.println("���"+result);
		return result; //result ���� ���������� �����Ѵ�.
	}
	void execute () {//���ϰ��� ���� void Ÿ�� execute ����.
		double result = avg (7,10);//����Ÿ�� result�� ���������ߴ� ��� avg�����ڿ� �Ű� �����Է��ϰ� ����.
		System.out.println("������ : "+result); //���� ���� ����Ѵ�.
	}
//	void println(String message) { //��� �޼ҵ尡 �����ִ�. sysout���� �ص� ����.
//		System.out.println(message);
//	}
	
	//����Ÿ���� �ִ� ��쿡 ���� ������ ��쿡�� ����Ÿ���� �����Ѵ�.
	
	
	
}
