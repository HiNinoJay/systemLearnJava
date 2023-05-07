package top.nino.依赖注入的方法.工厂方法注入.非静态工厂注入;


import top.nino.依赖注入的方法.工厂方法注入.非静态工厂注入.bean.FactoryDao;
import top.nino.依赖注入的方法.工厂方法注入.非静态工厂注入.bean.FactoryDaoImpl;

/**
 * 这个就是非静态工厂
 * @author zengzhongjie
 * @date 2023/5/7
 */
public class DaoFactory { // 非静态工厂
    public FactoryDao getFactoryDaoImpl() {
        return new FactoryDaoImpl();
    }
}
