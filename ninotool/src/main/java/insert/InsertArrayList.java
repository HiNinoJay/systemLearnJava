package insert;

import java.util.ArrayList;

/**
 * @author zengzhongjie
 * @date 2023/5/31
 */
public class InsertArrayList {

    public static ArrayList<Integer> insertRandomIntegerArray(ArrayList<Integer> arrayList) {
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(1);
        arrayList.add(6);
        arrayList.add(10);
        return arrayList;
    }

    public static ArrayList<Integer> insertIntegerArray(ArrayList<Integer> arrayList, Integer... data) {
        for (int i = 0; i < data.length; i++) {
            arrayList.add(data[i]);
        }
        return arrayList;
    }

    public static ArrayList<Integer> insertIntegerAndReturnArrayList(Integer... data) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        return insertIntegerArray(arrayList, data);
    }

}
