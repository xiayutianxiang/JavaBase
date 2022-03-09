package ThreadLocal;

/**
 * 同一个ThreadLocal变量在父线程中被设置值后，在子线程中是获取不到的。
 * （threadLocals中为当前调用线程对应的本地变量，所以二者自然是不能共享的）
 */
public class ThreadLocalTest2 {
    //创建一个threadlocal变量
    public static InheritableThreadLocal<String> strLocal = new InheritableThreadLocal<>();

    public static void main(String[] args) {
        //主线程添加变量
        strLocal.set("这个是主线程的变量");

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("子线程中的变量值: " + strLocal.get());
            }
        });
        t1.start();

        System.out.println("主线程中的变量值: " + strLocal.get());

    }
}
