package mycar;

import java.util.Scanner;

public class Bentley {

	public static void main(String[] args) {

			//��ĳ�ʸ� ����ϱ� ���� ����
		Scanner scan = new Scanner(System.in);
		String name;
		System.out.print("�̸���? : ");
		name=scan.next();
		System.out.println(name + " ��.");
		int hi;
		System.out.print("���̰�? ");
		hi=scan.nextInt();
		System.out.println(hi + " ��");
		String map;
		System.out.print("������? ");
		map=scan.next();
		System.out.println(map+ " �� ");
		
		System.out.println("����� �̸� : " +name);
		System.out.println("����� ���� : "+hi);
		System.out.println("����� ���� : "+map);
		
		scan.close();
		
		/*
		 * �����Է� :next()
		 * �����Է�:nextint()
		 * �Ǽ��Է�:nextDouble()
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
