package mycar;

public class Lexus {

	public static void main(String[] args) {
/*
 * random() �޼ҵ� : �����߻� �޼ҵ�
 * 1~10������ ���� �� �ϳ��� �߻���Ű����
 * Math.random() : 0.0���� ũ�ų� ���� 1.0���� ���� �Ǽ�
 * 0.0<=Math.random() < 1.0
 * 0<=Math.random()*10+1<10
 * 1<=Math.random()*10+1<11
 * 
 */
	//	int randomNumber;
	//	randomNumber =(int)(Math.random()*10)+1; //=>1~10������ ����
	//	System.out.println(randomNumber);
		
	/*�ֻ��� ��ȣ ��� ���α׷�
		*1~6������ ������ �߻����Ѽ� 
		*1�̳����� 1���� ���Խ��ϴ�.
		*2�� ������ 2���� ���Խ��ϴ�.
		**~~~~
		*6�� ������ 6���� ���Խ��ϴ�.*/
		
		
		 
	int ran;
	ran=(int)(Math.random()*6)+1;
	System.out.println(ran+"���� ���Խ��ϴ�");
	if(ran==6) {
		System.out.println("6���Դϴ�.");
	}
	else if (ran==5) {
			System.out.println("5���Դϴ�.");
	}
	else if (ran==4) {
		System.out.println("4���Դϴ�.");
}
	else if (ran==3) {
		System.out.println("3���Դϴ�.");
}
	else if (ran==2) {
		System.out.println("2���Դϴ�.");
}
	else if (ran==1) {
		System.out.println("1���Դϴ�.");
}
	else
		System.out.println("���Դϴ�");
}
		
		
		
		
		
		
		
		
		
	}

