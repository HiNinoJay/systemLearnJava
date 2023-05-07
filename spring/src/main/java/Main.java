import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import top.nino.bean.MessageService;

/**
 * @author zengzhongjie
 * @date 2023/5/7
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application.xml");

        System.out.println("启动成功");

        MessageService messageService = context.getBean(MessageService.class);

        System.out.println(messageService.getMessage());
    }
}
