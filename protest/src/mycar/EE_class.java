package mycar;

import java.util.Scanner;

public class EE_class {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int count=0;
		int per=0;
	
		String aw;
		String[][] str = {{"����1. �������� �̸���?","����2. �������� ��������?","����3.����?","����4. �λ��?"},{"���ο�","��õ","ȿ����","����"}};
		
		for(int i=0;i<str[0].length;i++) {
			System.out.println(str[0][i]);
				aw=scan.next();
				per++;
				if (aw.equals(str[1][i])){
					System.out.println("�����Դϴ�.");
					count++;
				}else {
					System.out.println("Ʋ�Ƚ��ϴ�.");
	}

}
		System.out.println("������ ��"+count+"�� �Դϴ�.");
		double percent=100*((double)count/str.length);
		System.out.println("Ȯ����"+percent+"% �Դϴ�.");
}
}