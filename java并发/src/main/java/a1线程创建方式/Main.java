package a1线程创建方式;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 线程创建的三种方式:
 * 1.new Thread()
 * 2.Runnable
 * 3.Callable
 * @author zengzhongjie
 * @date 2023/4/11
 */
public class Main {
    public static void main(String[] args) {

        new MyThread().start();

        new Thread(new MyRunnable()).start();

        FutureTask<String> futureTask = new FutureTask<>(new MyCallable());
        new Thread(futureTask).start();
        try {
            System.out.println("主动得到Callable执行结果：" + futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
