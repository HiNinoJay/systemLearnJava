package com.nino;

import com.nino.mapper.UserMapper;
import com.nino.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author zengzhongjie
 * @date 2023/4/11
 */
public class MyBatisApplication {
    public static final String URL = "jdbc:mysql://localhost:3306?system_learn_java?useUnicode=true";
    public static final String USER = "root";
    public static final String PASSWORD = "password";

    public static void main(String[] args) {
        String resource = "MyBatis-config.xml";
        InputStream inputStream = null;
        SqlSession sqlSession = null;
        try{
            // 读取MyBatis-config.xml
            inputStream = Resources.getResourceAsStream(resource);
            // 解析Mybatis-config.xml配置文件，创建sqlSessionFactory
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            // 创建sqlSession
            sqlSession = sqlSessionFactory.openSession();
            // 创建userMapper对象（userMapper并没有实现类）
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            // 调用userMapper对象的方法
            User user = userMapper.selectById(1);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            sqlSession.close();
        }
    }
}
