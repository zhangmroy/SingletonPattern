/**
 * Created by royz on 9/4/2016.
 */
public class Singleton2 {
    private static Singleton2 singleton = null;

    private Singleton2(){}

    public static synchronized Singleton2 getInstance() {
        if (singleton == null)
            singleton = new Singleton2();

        return singleton;
    }
}

/*
*       懒汉式singleton实现2
*     缺点：
*     1.多进程需要访问getInstance()的时候都需要等待锁，造成系统运行效率降低
*
*     解决思路：对getInstance()不上锁，只是同步所需要同步的部分 -》 singleton3
*
* */
