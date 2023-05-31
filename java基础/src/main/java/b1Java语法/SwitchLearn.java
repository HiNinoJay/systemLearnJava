package b1Java语法;

import a1数据类型.枚举类型;

/**
 * Java5 以前 switch(expr)中， expr 只能是 byte、short、char、int
 *
 * 从 Java 5 开始，Java中引入了枚举类型，expr 也可以是 enum类型
 *
 * 从 Java 7 开始，expr还可以是字符串（String）
 *
 * 长整型（long）在目前所有的版本中都是不可以的
 *
 * @author zengzhongjie
 * @date 2023/5/31
 */
public class SwitchLearn {


    public static void main(String[] args) {
        byte byteTest = 1;
        short shortTest = 2;
        char charTest = 3;
        int intTest = 4;
        枚举类型 enumTest = 枚举类型.MONDAY;
        String stringTest = "string";

        // switch目前仍不允许 匹配 long
        long longTest = 1L;

        switch (byteTest) {
            case 1:
                System.out.println("byte匹配成功");
                break;
            case 2:
            default:
                System.out.println("byte匹配失败");
        }

        switch (shortTest) {
            case 2:
                System.out.println("short匹配成功");
                break;
            case 3:
            default:
                System.out.println("short匹配失败");
        }


        switch (charTest) {
            case 3:
                System.out.println("char匹配成功");
                break;
            case 5:
            default:
                System.out.println("char匹配失败");
        }

        switch (intTest) {
            case 4:
                System.out.println("int匹配成功");
                break;
            case 5:
            default:
                System.out.println("int匹配失败");
        }
        switch (enumTest) {
            case MONDAY:
                System.out.println("Enum匹配成功");
                break;
            case TUESDAY:
            default:
                System.out.println("Enum匹配失败");
        }

        switch (stringTest) {
            case "string":
                System.out.println("String匹配成功");
                break;
            case "dsa":
            default:
                System.out.println("String匹配失败");
        }


    }

}
