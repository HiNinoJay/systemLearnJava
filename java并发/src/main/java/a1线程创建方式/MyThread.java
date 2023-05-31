package a1线程创建方式;

/**
 * @author zengzhongjie
 * @date 2023/4/11
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("I'm MyThread. I'm running");
    }

}
