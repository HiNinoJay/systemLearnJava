package top.nino.依赖注入的方法.构造器注入;

/**
 * 演示构造器注入
 * @author zengzhongjie
 * @date 2023/5/7
 */
public class CatDaoImpl {
    private String message;

    /**
     * 这里可以通过构造器注入
     * @param message
     */
    public CatDaoImpl(String message) {
        this.message = message;
    }
}
