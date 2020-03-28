
public class ZhangSanFactory implements IPersonFactory{

	@Override
	public AbsPerson create() {
		// TODO Auto-generated method stub
		return new ZhangSan("ZhangSan", "Nan", "Huang");
	}

}
