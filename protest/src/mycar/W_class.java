package mycar;

public class W_class {

	public static void main(String[] args) {

		/*
		 * �迭 (Array)
		 * �������� �����͸� ��� ����
		 * ����Ÿ�� �迭 : ����  int
		 * ����Ÿ�� �迭 : ����  String
		 * 
		 * 
		 */
		
		//�迭 ���� �ϱ�
		int[] scores= {90,95,80};
		String[] str = {"[���ο�]","[�ŵ���]","[������]","[�谭��]"};
		//        index[0][1][2] =�迭ũ��(����):3 ���� �� �?
		//�迭 �ε���:2  �� ��ȣ�� ��� ���� ������?
		
		//�迭�� �� ��ҿ� �����ؼ� �� ����ϱ�.
		//scores[0]
		
		System.out.println("scores[0]�� �� :"+scores[0]);
		System.out.println("scores[1]�� �� :"+scores[1]);
		System.out.println("scores[2]�� �� :"+scores[2]);
		
		System.out.println(str.length);//���ڹ迭�� ���� ���
		System.out.println("�츮 �� �̸�  : "+str[0]+str[1]+str[2]+str[3]);
		
		for(int i=0; i < str.length; i++) {
			System.out.println(str[i]);
			
			/*	System.out.println(str[0]);
				System.out.println(str[1]);
				System.out.println(str[2]);
				System.out.println(str[3]);
			*/
			
			
		}
		
		
		for(int j = 0;j<scores.length;j++) {
			
			System.out.println("scores["+j+"]�� �� :"+scores[j]);
			
			
		}
		
		//scores �迭�� ��� ���� ��� ���ؼ� ��� ���ϱ�.
		int[] k= {90,95,80};
		int sum=0;
		for(int o=0;+o<k.length;o++) {
		sum+=k[o];
		}System.out.println("���� �� :"+sum);
		System.out.println("���� �� :"+sum/k.length);
		
		
		
	}

}
