package mycar;

public class Audi {

	public static void main(String[] args) {
		//1.byteŸ���� ������ 3�� �����ؼ� -128,0,128�� ���� �����ϰ� �� ������ ����� ���� ���
		byte jin;
		byte min;
		byte wook;
		jin=-128;
		min=0;
		wook=127;
		System.out.println(jin);
		System.out.println(min);
		System.out.println(wook);
		//2.char Ÿ���� ������ �����ؼ� 'A'�� �����ϰ� ����� ���� ����ϼ���.
		char ain;
		ain='A';
		System.out.println(ain);
		//3.double Ÿ���� ������ �����ؼ� �Ǽ��� �����ϰ� ����� ���� ����ϼ���.
		double ala;
		ala=1.23;
		ala = 3e6;//3x10^6=3000000
		System.out.println(ala);
		//4.boolean Ÿ���� ������ �����ؼ� true�� �����ϰ� ����Ȱ��� ����ϼ���.
		boolean wow;
		wow=true;
		System.out.println(wow);
		
		
		char aaa,bbb,ccc;
		aaa='j';
		bbb='m';
		ccc='w';
		
		System.out.println(aaa+""+bbb+""+ccc);
		
		
		int lucky=444;
		int Guy=333;
		System.out.println(lucky+Guy);
		
		double happy=3.33;
		double day=4.44;
		System.out.println(happy+day);
		
		boolean jmw=true;
		System.out.println("���� �����ΰ�:"+jmw);
		
		byte asd=120,dsa=110,ssdds=111;
		System.out.println(asd-dsa+ssdds);
		
	}

}
