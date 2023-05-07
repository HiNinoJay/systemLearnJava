package top.nino.依赖注入的方法.工厂方法注入.静态工厂注入;

import top.nino.依赖注入的方法.工厂方法注入.静态工厂注入.bean.FactoryDao;

/**
 * @author zengzhongjie
 * @date 2023/5/7
 */
public class SpringAction {

    // 注入对象
    private FactoryDao staticFactoryDao;

    // 注入对象的 set 方法
    public void setStaticFactoryDao(FactoryDao staticFactoryDao) {
        this.staticFactoryDao = staticFactoryDao;
    }
}
