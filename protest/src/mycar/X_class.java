package mycar;

public class X_class {

	public static void main(String[] args) {

		/* 
		 * �迭 ����� ���� ���� �ʰ�
		 * �迭 ũ�⸸ ����
		 */
		//ũ�Ⱑ 3�̰� numbers��� �迭 ���� ����
		int[] numbers = new int[3];
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		//ũ�Ⱑ 3�� double,String �迭 ���� ���� �غ���.
		double[] sam = new double[3];
		String[] sem = new String[3];
		for(int j=0;j<sam.length;j++) {
			System.out.println(sam[j]);
		}
		for(int p=0;p<sem.length;p++) {
			System.out.println(sem[p]);
		}
		
		//numbers�� �� �����ϱ�
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		sam[0]=1;
		sam[1]=2;
		sam[2]=3;
		for(int j=0;j<sam.length;j++) {
			System.out.println(sam[j]);
		}
		sem[0]="1";
		sem[1]="2";
		sem[2]="3";
		for(int p=0;p<sem.length;p++) {
			System.out.println(sem[p]);
		}
	}
	
}
	