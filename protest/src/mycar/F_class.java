package mycar;

public class F_class {

	public static void main(String[] args) {
 //구구단 출력하기
		int i,j,k=0;
		for(i=2;i<=9;i++) {
			for(j=1;j<=9;j++) {
				System.out.print(i);
				System.out.print("x" +j+"="+i*j+"\t");
			}
			System.out.println("");
		}
	}
}
