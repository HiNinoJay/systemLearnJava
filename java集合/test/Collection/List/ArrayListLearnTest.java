package Collection.List;

import insert.InsertArrayList;
import junit.framework.TestCase;
import org.junit.Test;
import print.PrintArrayList;

import java.io.*;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * @author zengzhongjie
 * @date 2023/5/31
 */
public class ArrayListLearnTest extends TestCase {

    ArrayList arrayList = new ArrayList();

    @Test
    public void testArraylistSerializableOut() {
        arrayList.clear();
        InsertArrayList.insertRandomIntegerArray(arrayList);
        PrintArrayList.printInteger(arrayList);
        System.out.println("开始序列化ArrayList...");


        FileOutputStream fileOutputStream = null;
        ObjectOutputStream outputStream = null;

        try {
            fileOutputStream = new FileOutputStream("testArraylistSerializable.txt");
            outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(arrayList);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("序列化ArrayList完成...");
    }

    @Test
    public void testArraylistSerializableIn() {
        arrayList.clear();

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            fileInputStream = new FileInputStream("testArraylistSerializable.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            arrayList = (ArrayList) objectInputStream.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
                fileInputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("反序列化ArrayList结果:");
        PrintArrayList.printInteger(arrayList);
    }

}