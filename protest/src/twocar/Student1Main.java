package twocar;

public class Student1Main {

	public static void main(String[] args) {
		//Student 클래스에 대한 객체 생성
		Student1 mama =new Student1();
		// 필드값 출력
//		System.out.println(mama.name);
//		System.out.println(mama.phoneNumber);
		//name 필드에 값을 지정하여 출력하기.
		mama.setName("이름이름");
		System.out.println(mama.getName());
	}

}
