package twocar;

import java.util.Scanner;

public class LogMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String idd;
		int pww;
		Log nana = new Log();
		boolean lo=true;
		
		while(lo) {
			System.out.println("������ ���񽺸� �������ּ���.");
			System.out.println("1.�α���||2.�α׾ƿ�||3.����");
			int check =scan.nextInt();
			switch(check) {
			case 1:
				System.out.print("���̵� �Է��ϼ���: ");
				idd = scan.next();
				System.out.println("��й�ȣ�� �Է��ϼ���:" );
				pww = scan.nextInt();
				if(idd.equals(nana.id)) {
				
				}else if(pww==nana.pw) {
					System.out.println(nana.id+"�� �α��� �Ǿ����ϴ�.");
					break;
				}else{
					System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
					break;
				}
			case 2:
				
				System.out.println( "�α׾ƿ� �Ǿ����ϴ�.");
				break;
				
				
			case 3:
				System.out.println("�ý����� �����մϴ�.");
				lo=false;
				
			}
		}
	}

}
