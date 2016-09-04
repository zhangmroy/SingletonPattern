/**
 * Created by royz on 9/4/2016.
 */
public class Singleton5 {
    private volatile static Singleton5 singleton = new Singleton5();
    private Singleton5(){}

    public static Singleton5 getSingleton() {
        return singleton;
    }
}


/*
*
*   饿汉式加载，保证指令不可重排序即可。
*
*
*
* */