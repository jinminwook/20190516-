package mycar;

public class L_class {

	public static void main(String[] args) {
		
		while(true){
		  int i= (int) (Math.random()*6)+1;
		  int j= (int) (Math.random()*6)+1;
		 System.out.println("("+i+","+j+")");
		 if (i==2 && j==3) {
			 break;
		 }
		}
		System.out.println("종료입니다.");

	}

}
