package mycar;

import java.util.Scanner;

public class GG_class {

	public static void main(String[] args) {

		/*
		 * 동전갯수 구하기.
		 * 예)2680원을 입력하면
		 * 500원 :5개
		 * 100원:1개
		 * 50원 :1개
		 * 10원3개
		 */
		   /*
	       * ex)2680원을 입력하면
	       * 500원 : 5개
	       * 100원 : 1개
	       * 50원 : 1개
	       * 10원 : 3개
	       */
	      int money;
	      int temp = 0;
	      Scanner scan=new Scanner(System.in);
	      System.out.println("거스름돈 받을 금액을 입력하시오.:");
	      money=scan.nextInt();
	      int Money[]={500,100,50,10};
	      for(int i=0;i<Money.length;i++) {
	         if(money>=Money[i]) {
	            temp=money/Money[i];
	            money=money%Money[i];
	            System.out.println(Money[i]+"원 갯수 :"+temp);
	         }
	         }
	      scan.close();
	      }
	   }