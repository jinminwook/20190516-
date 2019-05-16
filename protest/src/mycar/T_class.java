package mycar;

public class T_class {

	public static void main(String[] args) {

		//1+(-2)+3+(-4)+5+(-6)+
		//형태의 계산을 할 때 얼마까지 더해야 합계가 100이상이 되는지 구하시오.
		int num=1;//정수형 변수 선언
		int sum=0;//정수형 합계 변수 선언
		int count=0;//정수형 카운트 변수 선언
		do { // 반복문 실행
			count++; //카운트 값이 1씩 증가함.
			if(num%2==1) { //if문 선언 num의 값이 홀수일때 합계형 변수에 대입한다.
				sum+=num;
			}else if(num%2==0) {//만약 그러지않으면 합계형 변수에 음수 -1을 곱해서 대입한다.
				sum+=num*(-1);
			}
			num++;//num을 증감시킨다.
			
			
			
		}while(sum<100); // sum값이 100보다 작을때는 반복한다 100을 넘으면 종료.
		System.out.println("총 횟수: "+count + "나오는 값 :"+sum);//종료될때 출력한다.
		
			
		
		
}
}