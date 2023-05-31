package a0code;

import d1抽象类和接口.InterfaceLearn;

/**
 * @author zengzhongjie
 * @date 2023/5/31
 */
public class 测试接口 implements InterfaceLearn {
    public static void main(String[] args) {

        // 调用接口的默认实现
        new 测试接口().test1();

        // 调用接口的静态方法实现
        InterfaceLearn.test2();

    }
}
