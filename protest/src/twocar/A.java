package twocar;

public class A {
	//�ʵ� ����
	public int field1;
	int field2;
	private int field3;
	//������ ����
	public A() {
		field1=1;
		field2=1;
		setField3(1);
		method1();
		method2();
		method3();
	}
	//�޼ҵ� ����
	public void method1() {}
	void method2() {}
	private void method3() {}
	public int getField3() {
		return field3;
	}
	public void setField3(int field3) {
		this.field3 = field3;
	}
	
	/*
	 * ���� ������
	 * 1.public
	 * 		  -������:Ŭ����,�ʵ�,������,�޼ҵ�
	 * 		  -��� Ŭ�������� ���� ����
	 * 2.protected
	 * 	-������ : �ʵ�,������,�޼ҵ�
	 * 	-�ڽ�Ŭ������ �ƴ� �ٸ� ��Ű���� �Ұ�Ǿ� ������ ���ٺҰ���
	 * 3.default
	 * 	-������ :Ŭ����,�ʵ�,������,�޼ҵ�
	 * 	-�ٸ� ��Ű���� �Ҽӵ� Ŭ������ ���� �Ұ���
	 * 4.private
	 * 	-������ : �ʵ�,������,�޼ҵ�
	 * 	-�ڽ��� �ƴ� �ٸ� Ŭ���������� ���� �Ұ���
	 *  
	 */
}
