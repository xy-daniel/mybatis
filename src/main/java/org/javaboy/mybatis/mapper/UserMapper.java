package org.javaboy.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.javaboy.mybatis.bean.User;

import java.util.List;
//mapper注解
//@Mapper
public interface UserMapper {

    List<User> getAllUser();

}
