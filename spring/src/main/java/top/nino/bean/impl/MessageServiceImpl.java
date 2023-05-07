package top.nino.bean.impl;

import top.nino.bean.MessageService;

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
