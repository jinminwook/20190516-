package ex190515;

public class StudentMain {

	public static void main(String[] args) {

		/*
		 * Student 클래스에 대한 객체 생성하고
		 * name,ssn,studentNo 필드값출력.
		 */
		Student nana = new Student("진민욱","앙앙",12);
		
		System.out.println(nana.name);
		System.out.println(nana.ssn);
		System.out.println(nana.studentNo);
	}

}
