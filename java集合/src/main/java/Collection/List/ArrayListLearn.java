package Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 详见测试类
 * @author zengzhongjie
 * @date 2023/5/31
 */
public class ArrayListLearn extends ArrayList {

    /**
     * 默认大小为 10
     * 1.5倍扩容
     */
    private static ArrayList arrayList = new ArrayList();

    /**
     * 详见测试类
     */
    public void testArraylistSerializableOut() {

    }

    /**
     * 详见测试类
     */
    public void testArraylistSerializableIn() {

    }

    /**
    * 实现ArrayList线程安全的方法
    */
   public void threadSafetyArrayList() {

       // 1. 使用 Vector 代替 ArrayList （不推荐，Vector是一个历史遗留类）
       // vector 默认大小 为 10， 方法都直接被synchronized关键字声明
       Vector<Integer> vector = new Vector<>();

       // 2. 使用 Collections.synchronizedList 包装 ArrayList，然后操作包装后的 list
       List list = Collections.synchronizedList(arrayList);

       // 3. 使用 CopyOnWriteArrayList 代替 ArrayList
       CopyOnWriteArrayList<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();

       // 4. 在使用 ArrayList 时，应用程序通过同步机制去控制 ArrayList 的读写。
   }

}
