package design_template已经ok;

public abstract class AbsGame {
	abstract void initalize();
	abstract void startPlay();
	abstract void endPlay();
	
	/**
	 * 模板
	 */
	public final void play(){
		initalize();
		startPlay();
		endPlay();
	}
	
}
