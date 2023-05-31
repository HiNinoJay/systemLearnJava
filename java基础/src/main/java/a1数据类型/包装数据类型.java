package a1数据类型;

/**
 * 包装数据类型含有缓存：-128-127
 * Float 和 Double 没有缓存缓存，因为浮点数缓存意义不大
 * @author zengzhongjie
 * @date 2023/5/31
 */
public class 包装数据类型 {
    private static void wrappedDataTypes() {
        // 数值型
        Byte wrapped_Byte ;
        Short wrapped_Short;
        Integer wrapped_Integer;
        Long wrapped_Long;

        // 字符型
        Character wrapped_Character;

        // 浮点型
        Float wrapped_Float;
        Double wrapped_Double;

        Boolean wrapped_Boolean;
    }

    private static void auto() {
        // 自动装箱
        Integer i = 10;

        // 自动拆箱
        int n = i;
    }


}
