package e1深浅拷贝.浅拷贝;

import lombok.Getter;
import lombok.Setter;

/**
 * @author zengzhongjie
 * @date 2023/5/31
 */
@Getter
@Setter
public class Person implements Cloneable{
    int money = 1;

    Dog dog = new Dog();


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
