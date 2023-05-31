package c1线程有几种状态;

/**
 * @author zengzhongjie
 * @date 2023/5/31
 */
public class ThreadStateLearn {

    /**
     * NEW	初始状态：线程被创建，但还没有调用start()方法
     * RUNNABLE	运行状态：Java线程将操作系统中的就绪和运行两种状态笼统的称作“运行”
     * BLOCKED	阻塞状态：表示线程阻塞于锁
     * WAITING	等待状态：表示线程进入等待状态，进入该状态表示当前线程需要等待其他线程做出一些特定动作（通知或中断）
     * TIME_WAITING	超时等待状态：该状态不同于 WAITIND，它是可以在指定的时间自行返回的
     * TERMINATED	终止状态：表示当前线程已经执行完毕
     */
}
