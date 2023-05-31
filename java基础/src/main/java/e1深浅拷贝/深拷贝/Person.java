package e1深浅拷贝.深拷贝;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author zengzhongjie
 * @date 2023/5/31
 */
@Getter
@Setter
public class Person implements Cloneable, Serializable {
    int money = 1;

    Dog dog = new Dog();


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person newPerson = (Person) super.clone();
         newPerson.dog = (Dog) dog.clone();
        return newPerson;
    }
}
