package ex190515;

public class SupersonicAirplaneMain {

	public static void main(String[] args) {
		/*
		 * SuperSonicAirplane Ŭ���� ��ü ����
		 */
		Supersonic ssa=
				new Supersonic();
		ssa.takeOff();
		ssa.fly();
		ssa.flymode = Supersonic.SUPERSONIC;
		ssa.fly();
		ssa.flymode = Supersonic.NORMAL;
		ssa.fly();
		ssa.land();
	}

}
