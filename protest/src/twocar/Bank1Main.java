package twocar;

import java.util.Scanner;

public class Bank1Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Bank1 클래스 타입의 변수선언.
		Bank1 stu = null;//이렇게 생성자 선언 안하게되면 밑에 인식을 하지못하게됨.
		boolean run = true;//boolean타입 run 선언.
		while(run) {//while 문에 boolean타입 run 넣고 실행
			System.out.println("하고 싶은 업무 선택");//반복할 출력문 입력.
			System.out.println("1.고객등록(1번)||2.고객등록(2번)||3.입금||4.출금||5.잔액보기||");
			int choice =scan.nextInt();//정수형 변수 choice 선언하고 목록을 보고 숫자를 입력받음.
			switch(choice){//switch문에 위에서 선언한 choice 변수를 넣고 실행함.
				case 1://1번을 선택했을때.
					System.out.println("이름");//"이름" 이라는 출력문을 출력.
					String name = scan.next();// 입력한값을 String name이라는 변수에 대입.
					System.out.println("계좌번호");//"계좌 번호"라는 출력문을 출력.
					String accountNumber = scan.next();//입력한 값을 String accountNumber 라는 변수에 대입해줌.
					System.out.println("초기 입금액");//"초기 입금액"이라는 출력문을 출력.
					int balance = scan.nextInt();//입력한 값을 balance라는 변수에 대입한다.
					//stu를 객체로 선언
					stu = new Bank1(name,accountNumber,balance);//내가 입력한 고객 정보가 나옴.
					break;
				case 2://2번을 선택했을때 
					System.out.println("이름");//위와 같이 출력된다.
					name = scan.next();
					System.out.println("계좌번호");
					accountNumber = scan.next();
					System.out.println("초기입금액");
					balance = scan.nextInt();
					stu = new Bank1();//위에 선언이 되어있기때문에 불러온다.
					stu.setName(name);
					stu.setAccountNumber(accountNumber);
					stu.setBalance(balance);
				case 3://3번을 선택했을때.
					System.out.println("입금액을 입력하세요.");//입력한 값 출력.
					int money = scan.nextInt();//입금할 금액 입력.
					//deposit 메소드 호출
					//매개변수 money
					stu.deposit(money);//deposit 메소드에 입금했던 금액 넣기.
					break;
				case 4://4번을 선택했을때.
					System.out.println("출금액을 입력하세요.");//입력한 값 출력.
					money = scan.nextInt();
					stu.withdraw(money);
					break;
				case 5:
					stu.checkBalance();
					break;
				case 6:
					run = false;
			}
		}
			}
}

		
		
		
	
