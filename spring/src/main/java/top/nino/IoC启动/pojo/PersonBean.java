package top.nino.IoC启动.pojo;

import lombok.Getter;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * 我这里，特意，接口重写的顺序，是安装实现顺序的
 * @author zengzhongjie
 * @date 2023/5/7
 */
@Getter
public class PersonBean implements BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {

    /**
     * 身份证号
     */
    private Integer no;

    /**
     * 姓名
     */
    private String name;

    public void setNo(Integer no) {
        this.no = no;
    }

    public PersonBean() {
        System.out.println("1.PersonBean()方法调用，构造方法：我出生了！");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2.setter()方法调用,设置属性：我的名字叫" + name);
    }
    /**
     * BeanNameAware
     * @param name
     */
    @Override
    public void setBeanName(String name) {
        System.out.println("3.调用BeanNameAware#setBeanName方法:我要上学了，起了个学名");
    }

    /**
     * BeanFactoryAware
     * @param beanFactory
     * @throws BeansException
     */
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("4.调用BeanFactoryAware#setBeanFactory方法：选好学校了");
    }

    // 第5步 这里可通过创建一个类 实现 BeanPostProcessor接口 重写方法 postProcessBeforeInitialization()

    /**
     * InitializingBean
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("6.InitializingBean#afterPropertiesSet方法：入学登记");
    }

    /**
     * 自定义的init()方法
     * 需要我们在配置文件中，进行bean调用这个方法的指定init-method
     */
    public void init() {
        System.out.println("7.自定义init方法：努力上学ing");
    }

    // 第8步 这里可通过创建一个类 实现 BeanPostProcessor接口 重写方法 postProcessAfterInitialization()

    /**
     * DisposableBean
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("9.DisposableBean#destroy方法：平淡的一生落幕了");
    }

    /**
     * 自定义的destroy()方法
     * 需要我们在配置文件中，进行bean调用这个方法的指定destroy-method
     */
    public void destroyMethod() {
        System.out.println("10.自定义destroy方法:睡了，别想叫醒我");
    }

    public void work(){
        System.out.println("Bean使用中：工作，只有对社会没有用的人才放假。。");
    }
}
