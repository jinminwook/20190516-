package ex190516;

public class Truck extends Car{
	
	//a.���緮�� ���� ��  �ִ� �ʵ�.
	private int capacity;
	
	//������ ����
	Truck(int speed,String color,int capacity){
		super(speed,color);
		this.capacity = capacity;
	}
	//b.���緮 return���ִ� �޼ҵ�.
	int getCapacity() {
		return capacity;
	}
}
