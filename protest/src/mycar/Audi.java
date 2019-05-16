package mycar;

public class Audi {

	public static void main(String[] args) {
		//1.byte타입의 변수를 3개 선언해서 -128,0,128을 각각 대입하고 각 변수에 저장된 값을 출력
		byte jin;
		byte min;
		byte wook;
		jin=-128;
		min=0;
		wook=127;
		System.out.println(jin);
		System.out.println(min);
		System.out.println(wook);
		//2.char 타입의 변수를 선언해서 'A'를 대입하고 저장된 값을 출력하세요.
		char ain;
		ain='A';
		System.out.println(ain);
		//3.double 타입의 변수를 선언해서 실수를 대입하고 저장된 값을 출력하세요.
		double ala;
		ala=1.23;
		ala = 3e6;//3x10^6=3000000
		System.out.println(ala);
		//4.boolean 타입의 변수를 선언해서 true를 대입하고 저장된값을 출력하세요.
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
		System.out.println("나는 누구인가:"+jmw);
		
		byte asd=120,dsa=110,ssdds=111;
		System.out.println(asd-dsa+ssdds);
		
	}

}
