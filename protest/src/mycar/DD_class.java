package mycar;

public class DD_class {

	public static void main(String[] args) {

		/*
		 * ������ �Ʒ��� ���� �� ��ü ���� ���.
		 * �г�   1�б� 2�б�
		 * 1�г� 1.9  2.5
		 * 2�г� 3.5  3.8
		 * 3�г� 4.1  4.2
		 * 4�г� 4.4  4.3
		 */
		double[][] jum={{1.9,3.5,4.1,4.4},{2.5,3.8,4.2,4.3}};
		double sum=0;
		double avg=0;
		for(int i=0;i<jum.length;i++) {
			for(int j=0;j<jum[i].length;j++) {
				System.out.print(jum[i][j]+" ");
				sum+=jum[i][j];
				avg=sum/(jum[i].length*jum.length);
			}
		}System.out.print("����"+sum);
		System.out.print("���"+avg);
		
		
		
		
		
	}

}
