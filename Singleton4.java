/**
 * Created by royz on 9/4/2016.
 */
public class Singleton4 {
    private static volatile Singleton4 singleton;

    private Singleton4(){}

    public static Singleton4 getSingleton() {
        if (singleton == null){
            synchronized (Singleton4.class){
                if (singleton == null)
                    singleton = new Singleton4();
            }
        }

        return singleton;
    }
}


/*
*       懒汉式singleton实现4  double-check
*     缺点：
*     1.虽然实现了线程安全的访问，但是代码冗杂
*
*
*     解决思路：类加载后就直接初始化， 即 饿汉式加载 -》5
*
* */