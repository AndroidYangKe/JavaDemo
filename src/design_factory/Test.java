package design_factory;

public class Test {
	public static void main(String[] args) {
		AbsFactory shapeF = FactoryProducer.getFactory("shape");
		IShape circle = shapeF.getShape("circle");
		circle.draw();

		IShape rectangle = shapeF.getShape("rectangle");
		rectangle.draw();

	}
}
