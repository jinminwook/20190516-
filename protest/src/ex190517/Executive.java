package ex190517;

public class Executive extends Manager {
	double stock;
	Executive(String name, double sal, double bonuss){
		super(name, sal, bonuss);
		
	}
	
	//스톡 옵션 있음.
	
	//급여 인상율은 30%
	@Override
	void raise() {
		this.sal=this.sal*1.3;
	}

	double getStock() {
		return stock;
	}

	
	}

	
