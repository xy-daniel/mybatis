package org.javaboy.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.javaboy.mybatis.bean.User;

import java.util.List;
//mapper注解
//@Mapper
public interface UserMapper {

    //这儿可以使用@Select进行查询---->这不是SpringBoot的独有功能ssm同样存在
    List<User> getAllUser();

}
