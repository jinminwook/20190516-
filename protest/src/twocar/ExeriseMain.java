package twocar;

public class ExeriseMain {
	//private �� �Ű�Ƚᵵ������ �� �Ͼ����� ���ش�.
	private String name;
	private int eg;
	private int kor;
	private int result;
	private double avg;
	//������ ����
	ExeriseMain(String name,int kor,int eg){
		//��ü ������ ���޹��� �Ű����� ���� �ʵ尪���� ����
		this.name=name;
		this.kor=kor;
		this.eg=eg;
	}
	//�⺻ ������ ����
	//������ �̸��� Ŭ���� �̸��� �����ϴ�.
	ExeriseMain(){
		
	}
				
	public String getName() {
		return name;
	}

						//�Ű����� �޾Ƽ�
	public void setName(String name) {
		//�ʵ� ���� ����
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



	//result �޼ҵ� ����
	 void result() {
		 double avg=(this.eg+this.kor)/2;
		 System.out.println(this.name+"����");
		 if(avg>=70.0) {
			 System.out.println("�հ�");
		 }else {
			 System.out.println("���հ�");
		 }
		 
	 }
	 
}



