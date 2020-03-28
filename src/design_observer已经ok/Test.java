package design_observer已经ok;

public class Test {
	public static void main(String[] args) {
		Obs2 ob1 = new Obs2();
		Obs1 s2 = new Obs1();
		Subjected s = new Subjected();
		
		s.addObs(ob1);
		s.addObs(s2);
		s.notify("---------");
	}
}
