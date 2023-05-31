package a1数据类型;

/**
 * enum 定义的枚举类默认继承了 java.lang.Enum 类
 * 实现了 java.lang.Serializable 和 java.lang.Comparable 两个接口。
 *
 * values(), ordinal() 和 valueOf() 方法位于 java.lang.Enum 类中：
 * values() 返回枚举类中所有的值。
 * ordinal()方法可以找到每个枚举常量的索引，就像数组索引一样。
 * valueOf()方法返回指定字符串值的枚举常量。
 *
 * @author zengzhongjie
 * @date 2023/5/31
 */
public enum 枚举类型 {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    /**
     * 枚举跟普通类一样可以用自己的变量、方法和构造函数
     *
     * 构造函数只能使用 private 访问修饰符，所以外部无法调用。
     *
     * 枚举既可以包含具体方法，也可以包含抽象方法。
     *
     * 如果枚举类具有抽象方法，则枚举类的每个实例都必须实现它。
     */
    private 枚举类型() {
        System.out.println("这是枚举类型的默认私有构造器。");
    }

    public void getToday() {
        System.out.println("这是自己定义的方法：" + this.name());
    }
}
