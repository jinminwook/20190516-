package ex190517;

public class EmployeeMain {

	public static void main(String[] args) {
			//각 직급별 직원에 대한 객체를 만들어서
		Employee emp=new Employee("사원",200);
		
		//급여를 인상해주고
		//각 직원의 이름,급여,보너스,스톡옵션을 각각 출력한다.
		System.out.println("이름 "+emp.getName());
		System.out.println("급여 "+emp.getSal());
		emp.raise();
		System.out.println("이름 "+emp.getName());
		System.out.println("급여 "+emp.getSal());
	}

}
