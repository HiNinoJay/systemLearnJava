package e1深浅拷贝.浅拷贝;

/**
 *
 * 浅拷贝是指在拷贝对象时，
 *
 * 只复制对象本身 和 其中包含的 基本数据类型的成员变量，
 *
 * 而不复制其中包含的引用类型的成员变量。
 *
 * 拷贝后的新对象和原对象共享引用类型成员变量所指向的对象，即它们指向同一个对象。
 *
 * 因此，如果修改其中一个对象的引用类型成员变量，另一个对象也会受到影响。
 * @author zengzhongjie
 * @date 2023/5/31
 */
public class ShallowCopyLearn {
    public static void main(String[] args) {
        Person number1 = new Person();
        Person number2 = null;

        try {
            number2 = (Person) number1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("两个人是否相等:" + (number1 == number2));
        System.out.println("两个人的基本数据类型钱是否相等:" + (number1.money == number2.money));
        System.out.println("两个人的引用类型狗是否相等:" + (number1.dog == number2.dog));
    }
}
