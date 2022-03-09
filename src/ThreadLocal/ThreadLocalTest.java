package ThreadLocal;

public class ThreadLocalTest {
    static ThreadLocal<String> strLocal = new ThreadLocal<>();  //threadlocal变量

    static void print(String str){
        System.out.println(str+" : " + strLocal.get());
        strLocal.remove();      //删除此线程局部变量的当前线程值
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                strLocal.set("local1");
                System.out.println("thread1: "+strLocal.get());
                print("thread1");
                System.out.println("after remove : " + strLocal.get());
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                strLocal.set("local2");
                System.out.println("thread2: "+strLocal.get());
                print("thread2");
                System.out.println("after remove : " + strLocal.get());
            }
        });
        //每个线程中的值互不影响
        t1.start();
        t2.start();
    }
}
