package i注解;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *
 * 注解可以标记在  类上、方法上、属性上 等，
 *
 * 标记自身也可以设置一些值
 *
 * 有了标记之后，我们就可以在编译或者运行阶段去识别这些标记，然后搞一些事情，这就是注解的用处。
 *
 * @author zengzhongjie
 * @date 2023/5/31
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface AnnotationLearn {

    /**
     * 注解生命周期有三大类，分别是：
     *
     * RetentionPolicy.SOURCE：给编译器用的，不会写入 class 文件
     * RetentionPolicy.CLASS：会写入 class 文件，在类加载阶段丢弃，也就是运行的时候就没这个信息了
     * RetentionPolicy.RUNTIME：会写入 class 文件，永久保存，可以通过反射获取注解信息
     *
     * 比如 Spring 常见的 Autowired ，就是 RUNTIME 的
     * 所以在运行的时候可以通过反射得到注解的信息，还能拿到标记的值 required 。
     */
}
