package mycar;

public class FF_class {

	public static void main(String[] args) {
		/*형 변환
		 * 1.자동형변환 (Promotion)
		 * 		:크기가 작은 타입으로 큰 타입으로 변환할 때
		 * 2.강제형변환 (Casting)
		 * 		:크기가 큰 타입을 작은타입으로 변환할 때
		 */
		//자동 형변환
		byte byteValue = 10;
		int intValue = byteValue;
		//자동 형변환(int(4)->double(8)
		double doubleValue = intValue;
		
		int intValue1=10;
		byte byteValue1 =(byte) intValue1;
		
		doubleValue = 2.2222;
		System.out.println(doubleValue);
		intValue1=(int) doubleValue;
		System.out.println(intValue1);
		System.out.println(doubleValue);
		
		
		
		
		
	}

}
