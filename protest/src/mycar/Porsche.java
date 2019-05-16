package mycar;

public class Porsche {

	public static void main(String[] args) {
			 //ctrl+shift+f 자동정렬
			 //string 타입의 변수 선언
			 String str="스트림변수에 저장되는 값";
			  System.out.print(str);
			  System.out.println(str);
			  String j="자바",m="재밌다";
			  String w=j+m;
			  System.out.println(w);
			  w=j+8.0;
			  System.out.println(w);
			  w=j+8+8;
			  System.out.println(w);
			  w=8+8+j;
			  System.out.println(w);
			  /*비교연산자
			   * 연산결과는 boolean 타입 (true,false)
			   * >,<,>=,<=
			   * ==:양변이 같은지 판단.같다면 true,다르다면 false
			   * !=:양변이 다른지판단 .같다면 false,다르다면 true
			   */
			  
			  int minmin=10,wowo=5;
					  boolean ami= minmin > wowo;
					  System.out.println(ami);
					  boolean alal=minmin<wowo;
					  System.out.println(alal);
					  boolean oor=minmin>=wowo;
					  System.out.println(oor);
					  boolean wpwp=minmin<=wowo;
					  System.out.println(wpwp);
					  boolean qpqp=minmin==wowo;
					  System.out.println(qpqp);
					  boolean epep=minmin!=wowo;
					  System.out.println(epep);
					  
					  //문자열이 같은지 비교할때
					  String str1="좌바";
					  String str2="좌바";
					  boolean resul=str1.equals(str2);
					  System.out.println(resul);
					  
					  int num3=1;
					  double num4=1.0;
					  resul = num3==num4;
					  System.out.println(resul);
					  
					  double num1=1.0;
					  int num2=1;
					  resul = num1==num2;
					  System.out.println(resul);
					  
					  
	}         

}
