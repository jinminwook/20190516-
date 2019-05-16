package ex190515;

public class Student extends People {
	/*
	 * People 클래스의 자식클래스로 만들기
	 * 
	 * studentNo 라는 정수형 필드 선언
	 * 3.name,ssn,studentNo 를 매개변수로 하는 생성자 선언
	 */
	int studentNo;
	
	Student(String name,String ssn,int studentNo){
//		this.name = name;
//		this.ssn = ssn;
		super(name,ssn);//super : 부모클래스가 가지고있는 생성자를 호출
		this.studentNo = studentNo;
	}
	
}
