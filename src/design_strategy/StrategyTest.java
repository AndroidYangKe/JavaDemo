package design_strategy;

public class StrategyTest {
	public static void main(String[] args) {
		Calculate c1 = new Calculate(new SubtractImpl());
		System.out.println(c1.calculate(2, 2));
		
		Calculate c2 = new Calculate(new MultiplyImpl());
		System.out.println(c2.calculate(2, 2));
		
		Calculate c3 = new Calculate(new SumImpl());
		System.out.println(c3.calculate(2, 2));
	}
}
