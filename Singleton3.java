/**
 * Created by royz on 9/4/2016.
 */
public class Singleton3 {
    private static Singleton3 singleton = null;

    private Singleton3 (){}

    public static Singleton3 getSingleton() {
        if (singleton == null){
            synchronized (Singleton3.class){
                if (singleton == null)
                    singleton = new Singleton3();
            }
        }
        return singleton;
    }
}


/*
*       懒汉式singleton实现3  double-check
*     缺点：
*     1.虽然实现了线程安全的访问，但是代码冗杂
*     2. singleton = new Singleton3() 可能会指令重排序：
*           错误场景：线程1在利用构造函数进行初始化成员之前，已经位singleton分配内存。此时线程2抢占了singleton，导致此时singleton
*           ！= null ， 但是又未完成初始化，从而导致程序出错。
*
*     解决思路：利用关键字volatile 禁止指令重排序 -》4
*
* */