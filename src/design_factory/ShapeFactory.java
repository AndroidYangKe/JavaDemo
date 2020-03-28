package design_factory;

public class ShapeFactory extends AbsFactory {

	@Override
	IShape getShape(String shape) {
		// TODO Auto-generated method stub
		if (shape == null) {
			return null;
		}
		if(shape.equalsIgnoreCase("circle")){
			return new Circle();
		} else if(shape.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		} else if(shape.equalsIgnoreCase("square")){
			return new Square();
		}
		
		return null;
	}

	@Override
	IColor getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
