package top.nino.依赖注入的方法.工厂方法注入.静态工厂注入;

import top.nino.依赖注入的方法.工厂方法注入.静态工厂注入.bean.FactoryDao;
import top.nino.依赖注入的方法.工厂方法注入.静态工厂注入.bean.StaticFactoryDaoImpl;

/**
 * 这个就是静态工厂
 * @author zengzhongjie
 * @date 2023/5/7
 */
public class DaoFactory { // 静态工厂
    public static final FactoryDao getStaticFactoryDaoImpl() {
        return new StaticFactoryDaoImpl();
    }
}
