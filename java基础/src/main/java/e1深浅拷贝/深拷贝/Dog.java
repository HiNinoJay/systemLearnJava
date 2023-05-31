package e1深浅拷贝.深拷贝;

import java.io.Serializable;

/**
 * @author zengzhongjie
 * @date 2023/5/31
 */
public class Dog implements Cloneable, Serializable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
