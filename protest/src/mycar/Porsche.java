package mycar;

public class Porsche {

	public static void main(String[] args) {
			 //ctrl+shift+f �ڵ�����
			 //string Ÿ���� ���� ����
			 String str="��Ʈ�������� ����Ǵ� ��";
			  System.out.print(str);
			  System.out.println(str);
			  String j="�ڹ�",m="��մ�";
			  String w=j+m;
			  System.out.println(w);
			  w=j+8.0;
			  System.out.println(w);
			  w=j+8+8;
			  System.out.println(w);
			  w=8+8+j;
			  System.out.println(w);
			  /*�񱳿�����
			   * �������� boolean Ÿ�� (true,false)
			   * >,<,>=,<=
			   * ==:�纯�� ������ �Ǵ�.���ٸ� true,�ٸ��ٸ� false
			   * !=:�纯�� �ٸ����Ǵ� .���ٸ� false,�ٸ��ٸ� true
			   */
			  
			  int minmin=10,wowo=5;
					  boolean ami= minmin > wowo;
					  System.out.println(ami);
					  boolean alal=minmin<wowo;
					  System.out.println(alal);
					  boolean oor=minmin>=wowo;
					  System.out.println(oor);
					  boolean wpwp=minmin<=wowo;
					  System.out.println(wpwp);
					  boolean qpqp=minmin==wowo;
					  System.out.println(qpqp);
					  boolean epep=minmin!=wowo;
					  System.out.println(epep);
					  
					  //���ڿ��� ������ ���Ҷ�
					  String str1="�¹�";
					  String str2="�¹�";
					  boolean resul=str1.equals(str2);
					  System.out.println(resul);
					  
					  int num3=1;
					  double num4=1.0;
					  resul = num3==num4;
					  System.out.println(resul);
					  
					  double num1=1.0;
					  int num2=1;
					  resul = num1==num2;
					  System.out.println(resul);
					  
					  
	}         

}
