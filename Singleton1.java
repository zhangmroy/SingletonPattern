/**
 * Created by royz on 9/4/2016.
 */
public class Singleton1 {
    private static  Singleton1 singleton = null;

    private Singleton1 (){}

    public static Singleton1 getInstance() {
        if (singleton == null)
            singleton= new Singleton1();

        return singleton;
    }
}

/*
*       懒汉式singleton实现1
*     缺点：
*     1.多进程访问getInstance()方法的时候，线程安全无法得到保证
*
*     解决思路：对getInstance()上锁-》 singleton2
*
* */

