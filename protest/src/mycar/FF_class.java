package mycar;

public class FF_class {

	public static void main(String[] args) {
		/*�� ��ȯ
		 * 1.�ڵ�����ȯ (Promotion)
		 * 		:ũ�Ⱑ ���� Ÿ������ ū Ÿ������ ��ȯ�� ��
		 * 2.��������ȯ (Casting)
		 * 		:ũ�Ⱑ ū Ÿ���� ����Ÿ������ ��ȯ�� ��
		 */
		//�ڵ� ����ȯ
		byte byteValue = 10;
		int intValue = byteValue;
		//�ڵ� ����ȯ(int(4)->double(8)
		double doubleValue = intValue;
		
		int intValue1=10;
		byte byteValue1 =(byte) intValue1;
		
		doubleValue = 2.2222;
		System.out.println(doubleValue);
		intValue1=(int) doubleValue;
		System.out.println(intValue1);
		System.out.println(doubleValue);
		
		
		
		
		
	}

}
