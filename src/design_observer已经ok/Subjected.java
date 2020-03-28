package design_observer已经ok;

import java.util.ArrayList;
import java.util.List;

public class Subjected implements Subject {
	private List<Observer> list = new ArrayList<>();

	/**
	 * 添加观察者
	 * 
	 * @param obs
	 */
	public void addObs(Observer obs) {
		list.add(obs);
	}

	/**
	 * 移除观察者
	 * 
	 * @param obs
	 */
	public void removeObs(Observer obs) {
		list.remove(obs);
	}

	/**
	 * 通知具体的观察者
	 * 
	 * @param msg
	 */
	public void notify(String msg) {
		for (Observer obs : list) {
			obs.update(msg);
		}
	}

}
