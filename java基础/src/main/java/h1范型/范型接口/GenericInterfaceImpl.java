package h1范型.范型接口;

/**
 * @author zengzhongjie
 * @date 2023/5/31
 */
public class GenericInterfaceImpl<T> implements  GenericInterface<String>{

    @Override
    public String methos() {
        return "hello";
    }
}
