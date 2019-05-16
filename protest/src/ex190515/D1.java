package ex190515;

public class D1 {
	//필드 선언
	private String id;
	private String pw;
	//로그인 메소드 선언
	void login(String id,String pw) {
		//넘겨받은 매개변수에 전달된 값을 필드에 저장
		this.id = id;
		this.pw = pw;
		//로그인 성공 실패 여부 판단
		if(id.equals("yourid")&&pw.contentEquals("12345")) {
			System.out.println(this.id+"님 로그인 되었습니다.");
			
		}else {
			System.out.println("id 또는 pw가 맞지 않습니다.");
			
		}
	}
	//로그인 메소드 선언 (리턴이 없는 경우)
	boolean loginBool(String id,String pw) {
		this.id=id;
		this.pw=pw;
		if(id.equals("yourid")&&pw.contentEquals("12345")) {
			return true;
			
		}else {
			return false;
		}
	}
	
	
	
	//로그아웃 메소드 선언
	void logout() {
		if(this.id==null) {
			System.out.println("로그인한 사용자가 없습니다.");
			
		}else {
			System.out.println(this.id+"님 로그아웃 되었습니다.");
		}
		
		
	}
}
