package design_decorator已经ok;

public class DecoratorTest {
	public static void main (String[] args) {
		IShape redCircle = new BorderDecorator(new CircleImpl());
		IShape redRectangle = new BorderDecorator(new RectangleImpl());
		
		redCircle.draw();
		redRectangle.draw();
	}
}
