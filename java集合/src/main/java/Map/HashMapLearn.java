package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zengzhongjie
 * @date 2023/5/31
 */
public class HashMapLearn {
    private static HashMap<String, Integer> hashMap = new HashMap<>();


    /**
     * 如何保证HashMap的线程安全
     */
    public void threadSafetyHashMap() {
        // 1.HashTable 是直接在操作方法上加 synchronized 关键字，锁住整个table数组，粒度比较大；
        Hashtable<String, Integer> hashTable = new Hashtable<>();

        // 2.Collections.synchronizedMap 是使用 Collections 集合工具的内部类
        // 通过传入 Map 封装出一个SynchronizedMap 对象，内部定义了一个对象锁，方法内通过对象锁实现；
        Map<String, Integer> stringIntegerMap = Collections.synchronizedMap(hashMap);

        // 3. ConcurrentHashMap 在jdk1.7中使用分段锁，在jdk1.8中使用CAS+synchronized
        ConcurrentHashMap<String, Integer> concurrentHashMap = new ConcurrentHashMap<>();
    }
}
