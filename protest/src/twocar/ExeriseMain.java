package twocar;

public class ExeriseMain {
	//private 꼭 신경안써도되지만 별 일없을땐 써준다.
	private String name;
	private int eg;
	private int kor;
	private int result;
	private double avg;
	//생성자 선언
	ExeriseMain(String name,int kor,int eg){
		//객체 생성시 전달받은 매개변수 값을 필드값으로 저장
		this.name=name;
		this.kor=kor;
		this.eg=eg;
	}
	//기본 생성자 선언
	//생성자 이름은 클래스 이름과 동일하다.
	ExeriseMain(){
		
	}
				
	public String getName() {
		return name;
	}

						//매개값을 받아서
	public void setName(String name) {
		//필드 값에 저장
		this.name = name;
	}



	public int getEg() {
		return eg;
	}



	public void setEg(int eg) {
		this.eg = eg;
	}



	public int getKor() {
		return kor;
	}



	public void setKor(int kor) {
		this.kor = kor;
	}



	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}



	public double getAvg() {
		return avg;
	}



	public void setAvg(double avg) {
		this.avg = avg;
	}



	//result 메소드 선언
	 void result() {
		 double avg=(this.eg+this.kor)/2;
		 System.out.println(this.name+"님은");
		 if(avg>=70.0) {
			 System.out.println("합격");
		 }else {
			 System.out.println("불합격");
		 }
		 
	 }
	 
}



