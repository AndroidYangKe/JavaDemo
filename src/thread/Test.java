package thread;

public class Test {
	private volatile static Test sInstance = null;
	private static Object obj = new Object();

	private Test() {
	}

	public static void main(String[] args) {
		test();
	}

	public static Test getInstance1() {
		if (sInstance == null) {
			synchronized (Test.class) {
				if (sInstance == null) {
					sInstance = new Test();
				}
			}
		}
		return sInstance;
	}

	public static Test getInstance2() {
		if (sInstance == null) {
			synchronized (obj) {
				if (sInstance == null) {
					sInstance = new Test();
				}
			}
		}
		return sInstance;
	}

	public static void test() {
		for (int i = 0; i < 1000; i++) {
			new Thread() {
				public void run() {
					getInstance1();
					getInstance2();
					System.out.println(sInstance);
				};
			}.start();
		}

	}

}
