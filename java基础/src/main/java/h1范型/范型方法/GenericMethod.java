package h1范型.范型方法;

/**
 * @author zengzhongjie
 * @date 2023/5/31
 */
public class GenericMethod {

    // E (element) 代表 Element
    public static <E> void printArray(E[] inputArray) {
        for(E element : inputArray) {
            System.out.println(element);
        }
        System.out.println();
    }
}
