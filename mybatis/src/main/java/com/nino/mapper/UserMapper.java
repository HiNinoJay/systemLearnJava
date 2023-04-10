package com.nino.mapper;

import com.nino.pojo.User;

/**
 * @author zengzhongjie
 * @date 2023/4/11
 */
public interface UserMapper {
    User selectById(Integer id);
}
