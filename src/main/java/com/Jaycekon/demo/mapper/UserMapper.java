package com.Jaycekon.demo.mapper;

import com.Jaycekon.demo.model.User;
import com.Jaycekon.demo.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created by weijie_huang on 2017/9/7.
 */
@Mapper
public interface UserMapper extends MyMapper<User> {

    @Select("select * from user where username=#{username}")
    User selectByName(String username);
}
