package mycar;

public class Lamborghini {

	public static void main(String[] args) {
		/*���Կ�����
		 +=,-=,*=,/=,%=
		 * a += b => a = a + b
		 */
		int jin=20,min=10;
		jin+=min;
		System.out.println("+����:"+jin);
		jin-=min;
		System.out.println("-����:"+jin);
		jin*=min;
		System.out.println("*����:"+jin);
		jin/=min;
		System.out.println("/����:"+jin);
		jin%=min;
		System.out.println("%����:"+jin);
		
		 
		boolean value1=true;
		System.out.println(value1);
		
		value1=!value1;
		System.out.println(value1);
		
		value1=!value1;
		System.out.println(value1);
		
		boolean boolResult = true;
		boolResult = true&&true;
		System.out.println("AND ����:" + boolResult);
		boolResult = true&&false;
		System.out.println("AND ����:" + boolResult);
		boolResult = true||false;
		System.out.println("OR ����:" + boolResult);
		boolResult = true||true;
		System.out.println("OR ����:" + boolResult);
		
		/* ���� ������
		 * ����:
		 * (���ǽ�)? ������ true �϶� ��� : false �϶� ���
		 
		 	 */
		int score = 80;
		String grade;
		//���׿����� ���
		grade =(score != 80)? "A" : "B";
		System.out.println("grade ���� �� : " + grade);
		
		
		
		
	}

}
