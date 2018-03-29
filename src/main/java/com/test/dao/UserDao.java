package com.test.dao;

import com.test.model.User;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface UserDao {
    /**
     * 根据用户的id查询用户信息
     * @param id
     * @return
     */
    User findUserById(Integer id);
}
