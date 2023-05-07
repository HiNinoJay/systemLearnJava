package top.nino.IoC启动.bean.impl;

import top.nino.IoC启动.bean.MessageService;

/**
 * @author zengzhongjie
 * @date 2023/5/7
 */
public class MessageServiceImpl implements MessageService {
    @Override
    public String getMessage() {
        return "hello springIoC";
    }
}
