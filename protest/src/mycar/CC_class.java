package mycar;

public class CC_class {

	public static void main(String[] args) {

		/*
		 * ������ �迭
		 * : 2���� �̻��� �迭
		 * : ��x�� �� ǥ�� ) [2][3] :2�� 3��   ������ �� ������ �� :�� 6���� ��.
		 * : ������� 2��3�� �迭�� �� 6���� ������ ����.
		 */
		//2���� �迭 ����
		//�������� 2��3��¥�� �迭
		int[][] score = new int[2][3];
		score[1][1]=10;
		//�迭�� ũ�� Ȯ��
		System.out.println(score.length);//���� ������ ���´�.
		System.out.println(score[0].length);//�� �࿡���� ���� ����
		
		//�迭�� �ʱⰪ Ȯ��
		//�ߺ� for ���� �̿��Ͽ�[0][0]~[1][2] ���� �� Ȯ��
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.println("score["+i+"]["+j+"]"+"="+score[i][j]);
			}
		}
		
		
		//�ʱⰪ�� �����ϸ鼭 2���� �迭 �����ϱ�.
		int[][] values= {{1,2,3},{4,5,6}};
		for(int i=0;i<values.length;i++) {
			for(int j=0;j<values[i].length;j++) {
				System.out.println("score=["+i+"]["+j+"]="+values[i][j]);
			}
		}
		
		String[][] uri ={{"���ο�","�ŵ���","������","�谭��"},{"������","�̼���","�����",}};
		for(int h=0;h<uri.length;h++) {
			for(int g=0;g<uri[h].length;g++) {
				System.out.println(uri[h][g]);
			}
		}
		
	}

}
