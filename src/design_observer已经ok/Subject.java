package design_observer已经ok;

/**
 * 
 * @author kexueyang 一个主题,用于管理观察者
 */
public interface Subject {
	void addObs(Observer obs);
	void removeObs(Observer obs);
	void notify(String msg);
}
