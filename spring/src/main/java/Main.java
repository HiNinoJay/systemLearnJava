import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.nino.IoC启动.pojo.PersonBean;

/**
 * @author zengzhongjie
 * @date 2023/5/7
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");

//        System.out.println("IoC容器启动成功");
//
//        MessageService messageService = context.getBean(MessageService.class);
//
//        System.out.println("bean MessageService: " + messageService.getMessage());
//
//        Thread.sleep(1000L);

        PersonBean personBean = (PersonBean) context.getBean("personBean");
        personBean.work();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
