package ex190517;

public class Employee {
	//직원의 이름,급여 정보를 가지고있음.
	public String name;
	public double sal;
	Employee(String name,double sal){
		this.name=name;
		this.sal=sal;
	}
	
	//급여 인상에 대한 메소드를 가짐.(인상율은 10%)
	void raise() {
		this.sal=this.sal*1.1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	
	
}
