package twocar;

public class Bank1 {
	
	String name;
	int balance;
	String accountNumber;
	
	Bank1(String name,String accountNumber,int balance){
		this.name=name;
		this.balance=balance;
		this.accountNumber=accountNumber;
	}
	Bank1(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	void deposit(int money) {
		balance +=money;
		System.out.println("�Ա��� �Ϸ� �Ǿ����ϴ�.");
		System.out.println("�ܾ���"+balance+"�� �Դϴ�.");
	}
		void withdraw(int money){
			balance -=money;
		if(balance<0) {
			System.out.println("�ܾ��� �����մϴ�.");
			balance +=money;
		}else {
			System.out.println("����� �Ϸ�Ǿ����ϴ�.");
			System.out.println("�ܾ���"+balance+"�� �Դϴ�.");
		}
	}
	void checkBalance() {
		System.out.println("�ܾ���"+balance+"�� �Դϴ�.");
	}
	
}
