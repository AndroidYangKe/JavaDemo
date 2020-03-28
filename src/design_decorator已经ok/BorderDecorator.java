package design_decorator已经ok;

public class BorderDecorator extends AbsShape {

	public BorderDecorator(IShape decoratedShape) {
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		super.draw();
		drawRedBorder(shapeDecorated);
	}

	/**
	 * 此函数是对draw函数的拓展
	 * 
	 * @param decoratedShape
	 */
	private void drawRedBorder(IShape decoratedShape) {
		System.out.println("setRedBorder");
	}
}
