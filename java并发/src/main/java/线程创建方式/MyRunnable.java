package 线程创建方式;

/**
 * @author zengzhongjie
 * @date 2023/4/11
 */
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("I'm MyRunnable. I'm Running");
    }
}
