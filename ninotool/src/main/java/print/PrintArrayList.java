package print;

import java.util.ArrayList;

/**
 * @author zengzhongjie
 * @date 2023/5/31
 */
public class PrintArrayList {

    public static void printInteger(ArrayList<Integer> arrayList) {
        System.out.print("当前arrayList的数据为：");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
