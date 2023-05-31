package c1修饰符.private修饰符;

/**
 * 注意：不能修饰类（外部类）
 *
 * 在同一类内可见
 *
 * 注意子类不也能直接访问其父类的private变量
 *
 * @author zengzhongjie
 * @date 2023/5/31
 */
public class PrivateLearn {

    // private 可以修饰变量
    private int a = 1;

    // private 可以修饰方法
    private void print() {
        System.out.println("PrivateLearn");
    }
}
