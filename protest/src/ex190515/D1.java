package ex190515;

public class D1 {
	//�ʵ� ����
	private String id;
	private String pw;
	//�α��� �޼ҵ� ����
	void login(String id,String pw) {
		//�Ѱܹ��� �Ű������� ���޵� ���� �ʵ忡 ����
		this.id = id;
		this.pw = pw;
		//�α��� ���� ���� ���� �Ǵ�
		if(id.equals("yourid")&&pw.contentEquals("12345")) {
			System.out.println(this.id+"�� �α��� �Ǿ����ϴ�.");
			
		}else {
			System.out.println("id �Ǵ� pw�� ���� �ʽ��ϴ�.");
			
		}
	}
	//�α��� �޼ҵ� ���� (������ ���� ���)
	boolean loginBool(String id,String pw) {
		this.id=id;
		this.pw=pw;
		if(id.equals("yourid")&&pw.contentEquals("12345")) {
			return true;
			
		}else {
			return false;
		}
	}
	
	
	
	//�α׾ƿ� �޼ҵ� ����
	void logout() {
		if(this.id==null) {
			System.out.println("�α����� ����ڰ� �����ϴ�.");
			
		}else {
			System.out.println(this.id+"�� �α׾ƿ� �Ǿ����ϴ�.");
		}
		
		
	}
}
