package c1修饰符.protect修饰符;

/**
 *
 * 对同一包内的类
 *
 * 和
 *
 * 所有子类可见
 *
 * 注意：不能修饰类（外部类）。
 *
 * @author zengzhongjie
 * @date 2023/5/31
 */
public class ProtectLearn {

    // 可以修饰变量
    protected int a = 1;

    // 可以修饰方法
    protected void test() {
        System.out.println("ProtectLearn");
    }
}
