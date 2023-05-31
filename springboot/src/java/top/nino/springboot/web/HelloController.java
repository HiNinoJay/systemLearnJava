package top.nino.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.nino.springboot.aop.WebLog;

/**
 * @author zengzhongjie
 * @date 2023/5/7
 */
@Controller
@ResponseBody
public class HelloController {

    @GetMapping("/hello")
    @WebLog()
    public String hello(String name){
        return "Hello "+ name;
    }

}
