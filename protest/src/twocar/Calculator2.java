package twocar;

public class Calculator2 {
	int plus(int x,int y) {//정수형 매개 변수 x,y 생성
		int result=x+y;//매개 변수의 합 result
		System.out.println("합계 :"+result);
		return result;//result 값을 최종적으로 선언한다. 
	}
	double avg(int x,int y){//평균구할때는 소숫점 나와야해서 더블타입 선언하고 정수형 매개변수 x,y 선언
		double sum =plus(x,y);//합을구하는 변수 sum 선언, 위에 선언했던 plus 대입.
		double result = sum /2;//result 변수에 plus가 대입되었던 sum변수를 나눠서 평균을 구함.
		System.out.println("평균"+result);
		return result; //result 값을 최종적으로 선언한다.
	}
	void execute () {//리턴값이 없는 void 타입 execute 선언.
		double result = avg (7,10);//더블타입 result에 위에선언했던 평균 avg생성자에 매개 값을입력하고 대입.
		System.out.println("실행결과 : "+result); //계산된 값을 출력한다.
	}
//	void println(String message) { //출력 메소드가 따로있다. sysout으로 해도 무방.
//		System.out.println(message);
//	}
	
	//리턴타입이 있는 경우에 값을 저장할 경우에만 리턴타입을 선언한다.
	
	
	
}
