package ex190517;

public class Manager extends Employee{
	double bonus;
	Manager(String name,double sal,double bonuss) {
		super(name, sal);
		this.bonus=bonuss;
		
	}

	//보너스도 있음.
	
	//급여 인상율은 20%
	
	double getbonus() {
		return bonus;
	}
	@Override
	void raise() {
		this.sal = (this.sal*1.2);
	}
}


