package com.springapp.db;

import com.springapp.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by ubuntu on 3/11/14.
 */
@Repository
public interface UserMapper {
    @Select("SELECT * FROM users WHERE name = #{name} and password = #{password}")
    User getUser(@Param("name") String name,@Param("password") String password);
}
