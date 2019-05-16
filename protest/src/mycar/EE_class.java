package mycar;

import java.util.Scanner;

public class EE_class {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int count=0;
		int per=0;
	
		String aw;
		String[][] str = {{"문제1. 출제자의 이름은?","문제2. 출제자의 거주지는?","문제3.동은?","문제4. 인사는?"},{"진민욱","인천","효성동","ㅎㅇ"}};
		
		for(int i=0;i<str[0].length;i++) {
			System.out.println(str[0][i]);
				aw=scan.next();
				per++;
				if (aw.equals(str[1][i])){
					System.out.println("정답입니다.");
					count++;
				}else {
					System.out.println("틀렸습니다.");
	}

}
		System.out.println("정답은 총"+count+"개 입니다.");
		double percent=100*((double)count/str.length);
		System.out.println("확률은"+percent+"% 입니다.");
}
}