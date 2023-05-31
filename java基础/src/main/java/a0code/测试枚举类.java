package a0code;

import a1数据类型.枚举类型;

/**
 * @author zengzhongjie
 * @date 2023/5/31
 */
public class 测试枚举类 {

    public static void main(String[] args) {

        // 调用 values()
        枚举类型[] values = 枚举类型.values();

        // 迭代枚举
        for(枚举类型 enumTemp : 枚举类型.values()) {
            System.out.println(enumTemp);
        }


        // 使用 valueOf() 返回枚举常量
        System.out.println(枚举类型.valueOf("MONDAY"));

        values[0].getToday();

        // 不存在的会报错 IllegalArgumentException
        System.out.println(枚举类型.valueOf("monday"));
    }
}
