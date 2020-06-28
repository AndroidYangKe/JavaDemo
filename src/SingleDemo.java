public class SingleDemo {
    private volatile static SingleDemo sInstance = null;

    private SingleDemo(){}
    public static SingleDemo getInstance() {
        if(sInstance == null) {
            synchronized (SingleDemo.class) {
                if(sInstance == null) {
                    sInstance = new SingleDemo();
                }
            }
        }
        return sInstance;
    }
}
