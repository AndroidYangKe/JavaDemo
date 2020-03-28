package design_factory;

public class ColorFactory extends AbsFactory{

	@Override
	IColor getColor(String color) {
		// TODO Auto-generated method stub
		if(color == null) {
			return null;
		}
		if(color.equals("red")){
			return new Red();
		} else if(color.equals("blue")){
			return new Blue();
		} else if(color.equals("green")){
			return new Green();
		}
		
		return null;
	}

	@Override
	IShape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
