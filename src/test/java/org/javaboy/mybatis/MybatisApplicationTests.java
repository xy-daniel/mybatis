package org.javaboy.mybatis;

import org.javaboy.mybatis.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MybatisApplicationTests {

    @Autowired(required = false)
    UserMapper userMapper;

    @Test
    void contextLoads() {
        System.out.println(userMapper.getAllUser());
    }

}
