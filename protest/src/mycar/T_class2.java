package mycar;

public class T_class2 {

	public static void main(String[] args) {
		
		int num=1;
		int sum=0;
		int count=1;
		int s=1;
		
		while(true) {
			sum=sum+num;
			if(sum>=100) {
				break;
			}else {
				count++;
				s=-s;
				num=s*count;
				System.out.println("���� num,s,count�� : "+num + ","+s+","+count);
			}
		}
		
		System.out.println("���� : "+num);
		System.out.println("�հ� : "+sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
