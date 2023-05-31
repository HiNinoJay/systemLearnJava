package top.nino.springboot.aop;

import java.lang.annotation.*;

/**
 * 自定义一个注解作为切点
 * @author zengzhongjie
 * @date 2023/5/7
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface WebLog {

}
