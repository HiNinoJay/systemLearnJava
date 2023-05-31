package a1线程创建方式;

import java.util.concurrent.Callable;

/**
 * @author zengzhongjie
 * @date 2023/4/11
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        return "I'm MyCallable. I'm Running and Returning";
    }
}
