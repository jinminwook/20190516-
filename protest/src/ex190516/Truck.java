package ex190516;

public class Truck extends Car{
	
	//a.적재량을 담을 수  있는 필드.
	private int capacity;
	
	//생성자 선언
	Truck(int speed,String color,int capacity){
		super(speed,color);
		this.capacity = capacity;
	}
	//b.적재량 return해주는 메소드.
	int getCapacity() {
		return capacity;
	}
}
