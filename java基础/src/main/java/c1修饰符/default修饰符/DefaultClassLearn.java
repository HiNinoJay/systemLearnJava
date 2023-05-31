package c1修饰符.default修饰符;

/**
 * 不写修饰符，即表示default
 *
 * 在同一包内可见
 *
 * @author zengzhongjie
 * @date 2023/5/31
 */
class DefaultClassLearn {

    // default 可以修饰变量
    int a = 1;

    // default 可以修饰方法
    void print() {
        System.out.println("DefaultClassLearn");
    }

}
