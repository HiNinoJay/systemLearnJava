package d1抽象类和接口;

/**
 * 接⼝是对⾏为的抽象，是⼀种⾏为的规范。
 * @author zengzhongjie
 * @date 2023/5/31
 */
public interface InterfaceLearn {

    // 接口中只能含有 static final 修饰的变量
    public static final int a = 1;

    /**
     * Java8 开始 接口方法有默认方法实现
     */
    default void test1() {
        System.out.println("这是接口的默认实现");
    }

    /**
     * Java8 开始 接口方法有静态方法实现
     */
    static void test2() {
        System.out.println("这是接口的静态方法实现");
    }

    /**
     * jdk 9 开始 接⼝中引⼊了 私有⽅法 和 私有静态⽅法。
     */

}
