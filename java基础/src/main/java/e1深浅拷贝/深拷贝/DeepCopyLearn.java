package e1深浅拷贝.深拷贝;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * 深拷贝是指在拷贝对象时，
 *
 * 不仅复制对象本身和其中包含的基本数据类型的成员变量，
 * 还会递归地复制其中包含的引用类型的成员变量所指向的对象。
 *
 * 拷贝后的新对象和原对象不共享任何对象，它们指向的是两个完全独立的对象。
 *
 * 因此，修改其中一个对象的引用类型成员变量不会影响另一个对象。
 *
 *
 * 深拷贝如何实现呢？
 * 1. 重写克隆方法：重写克隆方法，引用类型变量单独克隆，这里可能会涉及多层递归。
 * 2. 序列化：可以先将原对象序列化，再反序列化成拷贝对象。
 *
 * @author zengzhongjie
 * @date 2023/5/31
 */
public class DeepCopyLearn {

    public static void main(String[] args) {
        Person number1 = new Person();
        Person number2 = null;

        System.out.println("通过克隆方法实现");

        try {
            // 这里深拷贝是通过重写克隆方法实现的
            number2 = (Person) number1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("两个人是否相等:" + (number1 == number2));
        System.out.println("两个人的基本数据类型钱是否相等:" + (number1.money == number2.money));
        System.out.println("两个人的引用类型狗是否相等:" + (number1.dog == number2.dog));


        // 还可以通过序列化实现
        System.out.println("通过序列化实现");

        number2 = null;
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            fileOutputStream = new FileOutputStream("序列化实现深拷贝.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(number1);

            fileInputStream = new FileInputStream("序列化实现深拷贝.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            number2 = (Person) objectInputStream.readObject();

        } catch (Exception e ) {
            e.printStackTrace();
        }

        System.out.println("两个人是否相等:" + (number1 == number2));
        System.out.println("两个人的基本数据类型钱是否相等:" + (number1.money == number2.money));
        System.out.println("两个人的引用类型狗是否相等:" + (number1.dog == number2.dog));

    }
}
