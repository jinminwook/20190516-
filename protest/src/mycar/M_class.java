package mycar;

public class M_class {

	public static void main(String[] args) {

		/*
		 * 
		 **
		 ***
		 ****
		 *****
		*/		
//		String gi;
//		gi="*";
//		while(true) {
//			System.out.println(gi);
//			gi=gi+"*";
//			
//			
//			if(gi.equals("******")) {
//				break;
//			}
//		}
		
		for(int i = 1; i<=5; i++) { //�� �ټ�
			for(int j=1;j<=i;j++) {//������
				System.out.print("*");
				if(j==i) 
					System.out.println();
				}
			}
		}
}

