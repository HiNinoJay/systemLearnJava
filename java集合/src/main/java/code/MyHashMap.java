package code;

/**
 * 散列函数：hashCode()+除留余数法
 * 冲突解决：链地址法
 * 扩容：节点重新hash获取位置
 *
 * @author zengzhongjie
 * @date 2023/5/31
 */
public class MyHashMap<K, V> {

    /**
     * 内部节点类
     * @param <K>
     * @param <V>
     */
    class Node<K, V> {
        private K key;
        private V value;

        private Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    // 默认容量
    private final int DEFAULT_CAPACITY = 16;

    // 负载因子
    private final float LOAD_FACTOR = 0.75f;

    // HashMap已存储的元素个数
    private int size;

    // 桶数组
    Node<K, V>[] buckets;

    /**
     * 无参构造器，设置桶数组默认容量
     */
    public MyHashMap() {
        buckets = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * 有参构造器，指定桶数组容量
     * @param capacity
     */
    public MyHashMap(int capacity) {
        buckets = new Node[capacity];
        size = 0;
    }

    /**
     * 哈希函数，获取地址
     * @param key
     * @param length
     * @return
     */
    private int getIndex(K key, int length) {
        // 获取 hash code
        int hashCode = key.hashCode();

        // 和桶数组长度取余
        int index = hashCode & (length - 1);
        return index;
    }

    /**
     * put 放入元素
     * @param key
     * @param value
     */
    public void put(K key, V value) {
        // 先判断是否需要扩容
        if(size >= buckets.length * LOAD_FACTOR) resize();
        putVal(key, value, buckets);
    }

    /**
     * 扩容
     */
    private void resize() {
        Node<K, V>[] newBuckets = new Node[buckets.length * 2];
        rehash(newBuckets);
        buckets = newBuckets;
    }

    /**
     * 重新散列当前元素
     * @param newBuckets
     */
    private void rehash(Node<K,V>[] newBuckets) {
        // map大小计算
        size = 0;

        for(int i = 0; i < buckets.length; i++) {
            if(buckets[i] == null) {
                continue;
            }
            Node<K, V> node = buckets[i];
            while(node != null) {
                putVal(node.key, node.value, newBuckets);
                node = node.next;
            }
        }
    }

    private void putVal(K key, V value, Node<K,V>[] buckets) {
        int index = getIndex(key, buckets.length);
        // 插入之前，先拿到该位置的元素
        Node node = buckets[index];

        if( node == null) {
            buckets[index] = new Node(key, value);
            size++;
            return;
        }

        // 如果头结点不为null，说明发生哈希冲突
        while(node != null) {
            if(node.key.hashCode() == key.hashCode() && (node.key == key || node.key.equals(key))) {
                node.value = value;
                // 覆盖掉，直接返回
                return;
            }
            node = node.next;
        }

        // 到这一步说明不在链表中，这里用的头插法
        Node newNode = new Node(key, value, buckets[index]);
        buckets[index] = newNode;
        size++;
    }

    /**
     * 获取元素
     * @param key
     * @return
     */
    public V get(K key) {
        int index = getIndex(key, buckets.length);
        if(buckets[index] == null) {
            return null;
        }
        Node<K, V> node = buckets[index];
        while(node != null) {
            if((node.key.hashCode() == key.hashCode()) && (node.key == key || node.key.equals(key))) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    /**
     * 返回HashMap
     * @return
     */
    public int size() {
        return size;
    }
}
