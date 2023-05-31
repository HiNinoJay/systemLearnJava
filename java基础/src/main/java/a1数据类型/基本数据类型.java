package a1数据类型;

/**
 *
 * Java数据类型分为两种：
 * 1.基本数据类型
 * 2.引用数据类型
 * @author zengzhongjie
 * @date 2023/4/22
 */
public class 基本数据类型 {


    /**
     * 自动类型转换、强制类型转换：
     * byte -> short ->
     *                  int -> long -> float -> double
     *         char  ->
     *
     * 都有其包装数据类型
     */
    private static void basicDataTypes() {
        // 数值型
        byte basic_byte; // 1字节 默认 0
        short basic_short; // 2字节 默认 0
        int basic_int; // 4字节 默认 0
        long basic_long; // 8字节 默认 0L

        // 字符型
        char basic_char; // 2字节 默认 'u0000'

        // 浮点型
        float baisc_float; // 4字节 默认 0f
        double basic_double; // 8字节 默认 0d

        boolean basic_boolean; // 1位 默认 false
    }

}
