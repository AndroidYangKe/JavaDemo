package design_decorator已经ok;
/**
 * Shape装饰器类
 * @author kexueyang
 *
 */
public abstract class AbsShape implements IShape{
	IShape shapeDecorated;
	
	public AbsShape (IShape shapeDecorated) {
		this.shapeDecorated = shapeDecorated;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		shapeDecorated.draw();
	}
}
