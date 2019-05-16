package mycar;

import java.util.Scanner;

public class P_class {

	public static void main(String[] args) {

		//정수를 하나 입력받아 1부터 입력한 숫자까지 2의 배수 3의 배수를 제외한 수의 총합 구하기.
		//1.숫자입력받기--scanner 사용  num
		//2.1부터 입력한 숫자까지 순차적 접근.for문사용 for (inti=1;i<=num;i++)
		//3.숫자 중에서 2의배수,3의배수를 제외한 숫자 걸러내기 --조건 if
		//3-1 2의 배수 3의 배수 걸러낼 방법? --나머지가 0 인값.
		//4.걸러낸 숫자의 합 구하기.-- 누적합.
		//5.합 출력 -- prinrt
		
		
		
		int i; //정수형 변수 i 선언
		int sum=0;//정수형 sum 값을 0으로 선언
		Scanner scan = new Scanner(System.in);//스캔문
		i=scan.nextInt();//i값으로 입력받겠다.
		for(int j=1;j<=i;j++) {//반복문 정수형 임시 j선언해서 1값을 부여하고 j값은 i값에 크거나 같아야하고 j증감한다.
			if(j%2!=0 && j%3!=0) {//반복문 j의 선정된 값이 2로 나누었을때 0인것이 아닌 또 3으로 나누었을때 0인것이 아닌것들만 추려낸다.
				sum+=j;//sum값에 j 값을 대입한다.
			}
		
		}

		System.out.println(sum);
		
				
			
			}
		
		
		
		
		
	}


