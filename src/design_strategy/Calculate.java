package design_strategy;

public class Calculate {
	private ICalculate mICalculate;

	public Calculate(ICalculate iCalculate) {
		super();
		this.mICalculate = iCalculate;
	}

	public int calculate(int num1, int num2) {
		return mICalculate.calculate(num1, num2);
	}
}
