package javava;

import twocar.A;

public class C{
	
//	//AŬ���� Ÿ���� ���� a ����
//	A a;
//	//BŬ���� Ÿ���� ���� b ����
//	B b;
	
	C(){
		//AŬ������ ���� ��ü ����
		A a = new A();
		//��ü�� ���� AŬ������ �ʵ� �� ������ �����غ���
		a.field1 =10;
		a.field2 =20;
		a.setField3(30);
		//�޼ҵ� ȣ��
		a.method1();
		a.method2();
		a.method3();
		}
}
