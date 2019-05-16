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
		System.out.println("입금이 완료 되었습니다.");
		System.out.println("잔액은"+balance+"원 입니다.");
	}
		void withdraw(int money){
			balance -=money;
		if(balance<0) {
			System.out.println("잔액이 부족합니다.");
			balance +=money;
		}else {
			System.out.println("출금이 완료되었습니다.");
			System.out.println("잔액은"+balance+"원 입니다.");
		}
	}
	void checkBalance() {
		System.out.println("잔액은"+balance+"원 입니다.");
	}
	
}
