package mycar;

import java.util.Scanner;

public class O_class {

	public static void main(String[] args) {

		/*������ �Է¹޾� Ȧ������ ¦�������� ����ϰ�.
		 * 0�� �Է��ϸ� ���α׷��� ����ǵ��� �ϼ���.
		 */
		int i;//������ ���� i����
		Scanner scan = new Scanner(System.in);//��ĳ�� ��
		System.out.println("���ڸ� �Է��ϼ���");//ó�� ����ϴ� ����
		System.out.println("�����Ͻ÷��� 0��������.");
		do { // �ݺ��� do ~ while����
			i=scan.nextInt(); //������ �Է�
			if(i==0) {//if �� ���� �ޱ� i���� 0�϶� ����
				System.out.println("���� ��.");//���� ���
				break; // �ݺ� ���߱�
			}
			System.out.println((i%2==1)? "Ȧ���Դϴ�." : "¦�� �Դϴ�.");//���׹�����  2�� i���� ���������� ������ ���� Ȧ���� true ¦���� false
			
		}while(i!=0);//i�� ���� 0�� �ƴҶ� �ٽ� �ݺ��Ѵ�.
				scan.close(); //��ĵ ����
		}
		
	}
