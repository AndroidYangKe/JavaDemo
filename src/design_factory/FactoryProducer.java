package design_factory;

public class FactoryProducer {
	public static AbsFactory getFactory(String par) {
		if (par.equalsIgnoreCase("shape")) {
			return new ShapeFactory();
		} else if (par.equalsIgnoreCase("color")) {
			return new ColorFactory();
		}

		return null;
	}
}
