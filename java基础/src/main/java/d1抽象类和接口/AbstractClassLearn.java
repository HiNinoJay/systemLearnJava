package d1抽象类和接口;

/**
 * 抽象是对类的抽象，是⼀种模板设计
 * @author zengzhongjie
 * @date 2023/5/31
 */
public abstract class AbstractClassLearn {

    // 抽象类其他变量都可以包含
    int a = 1;

    public static final int b = 2;

    // 抽象类其他变量都可以包含
    protected int c = 3;

    // 抽象类可以含有具体实现的方法
    public void test1() {
        System.out.println("抽象类方法具体实现");
    }

    // 抽象类的抽象方法
    abstract void test2();
}
