package ex190515;

public class Student extends People {
	/*
	 * People Ŭ������ �ڽ�Ŭ������ �����
	 * 
	 * studentNo ��� ������ �ʵ� ����
	 * 3.name,ssn,studentNo �� �Ű������� �ϴ� ������ ����
	 */
	int studentNo;
	
	Student(String name,String ssn,int studentNo){
//		this.name = name;
//		this.ssn = ssn;
		super(name,ssn);//super : �θ�Ŭ������ �������ִ� �����ڸ� ȣ��
		this.studentNo = studentNo;
	}
	
}
