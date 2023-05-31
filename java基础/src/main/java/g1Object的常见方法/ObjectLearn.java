package g1Object的常见方法;

/**
 * @author zengzhongjie
 * @date 2023/5/31
 */
public class ObjectLearn {


    /**
     * 对象比较：
     *
     * public native int hashCode() ：
     * native 方法，用于返回对象的哈希码，主要使用在哈希表中，比如 JDK 中的 HashMap。
     *
     * public boolean equals(Object obj)：
     * 用于比较 2 个对象的内存地址是否相等，String 类对该方法进行了重写用户比较字符串的值是否相等。
     */


    /**
     * 对象拷贝：
     *
     * protected native Object clone() throws CloneNotSupportedException：
     * naitive 方法，用于创建并返回当前对象的一份拷贝。
     *
     * 一般情况下，对于任何对象 x，表达式 x.clone() != x 为 true，x.clone().getClass() == x.getClass() 为 true。
     * Object 本身没有实现 Cloneable 接口，所以不重写 clone 方法并且进行调用的话会发生 CloneNotSupportedException 异常。
     */


    /**
     * 对象转字符串：
     *
     * public String toString()：返回类的名字@实例的哈希码的 16 进制的字符串。
     *
     * 建议 Object 所有的子类都重写这个方法。
     */


    /**
     * 多线程调度：
     *
     * public final native void notify()：
     * native 方法，并且不能重写。
     * 唤醒一个在此对象监视器上等待的线程(监视器相当于就是锁的概念)。如果有多个线程在等待只会任意唤醒一个。
     *
     * public final native void notifyAll()：
     * native 方法，并且不能重写。
     * 跟 notify 一样，唯一的区别就是会唤醒在此对象监视器上等待的所有线程，而不是一个线程。
     *
     * public final native void wait(long timeout) throws InterruptedException：
     * native 方法，并且不能重写。暂停线程的执行。注意：sleep 方法没有释放锁，而 wait 方法释放了锁 。
     * timeout 是等待时间。
     *
     * public final void wait(long timeout, int nanos) throws InterruptedException：
     * 多了 nanos 参数，这个参数表示额外时间（以毫微秒为单位，范围是 0-999999）。
     * 所以超时的时间还需要加上 nanos 毫秒。
     *
     * public final void wait() throws InterruptedException：
     * 跟之前的 2 个 wait 方法一样，只不过该方法一直等待，没有超时时间这个概念
     */


    /**
     * 反射：
     *
     * public final native Class<?> getClass()：
     * native 方法，用于返回当前运行时对象的 Class 对象，使用了 final 关键字修饰，故不允许子类重写。
     */


    /**
     * 垃圾回收：
     *
     * protected void finalize() throws Throwable ：通知垃圾收集器回收对象。
     * #
     */
}
