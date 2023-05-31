package code;

/**
 * @author zengzhongjie
 * @date 2023/5/31
 */
public class Main {

    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();

        myHashMap.put("A", 1);
        System.out.println(myHashMap.get("A"));

        myHashMap.put("A", 2);
        System.out.println(myHashMap.get("A"));
    }
}
