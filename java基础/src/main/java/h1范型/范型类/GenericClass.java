package h1范型.范型类;

/**
 * 范型类
 *
 * 常用的通配符为： T，E，K，V，？
 *
 * ？ 表示不确定的 java 类型
 * T (type) 表示具体的一个 java 类型
 * K V (key value) 分别代表 java 键值中的 Key Value
 * E (element) 代表 Element
 *
 * @author zengzhongjie
 * @date 2023/5/31
 */
public class GenericClass<T> {

    // T (type) 表示具体的一个 java 类型
    private T key;

    public GenericClass(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }
}
