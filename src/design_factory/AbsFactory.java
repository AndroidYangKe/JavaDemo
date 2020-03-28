package design_factory;

public abstract class AbsFactory {
	abstract IColor getColor(String color);
	abstract IShape getShape(String shape);

}
