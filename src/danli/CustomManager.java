package danli;

public class CustomManager {

    private volatile static CustomManager mInstance;    //要返回的

    private CustomManager() {
    }   //私有化构造方法

    /**
     * 双重检查
     *
     * @return
     */
    public static CustomManager getInstance() {
        if (mInstance == null) {
            synchronized (CustomManager.class) {
                if (mInstance == null) {
                    mInstance = new CustomManager();
                }
            }
        }
        return mInstance;
    }

    /**
     * 静态内部类
     * 只有当getInstance()被调用才会初始化instance
     * 线程安全且能保证单例的唯一性，缺点在于无法传递参数，如Context
     */
    public static class CustomManagerHolder {
        private static final CustomManager instance = new CustomManager();
    }

    public static CustomManager getInstance2() {
        return CustomManagerHolder.instance;
    }
}
