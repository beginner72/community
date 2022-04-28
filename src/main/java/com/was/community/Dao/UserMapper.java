package com.was.community.Dao;

import com.was.community.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: wasx
 * @Date: 2022/4/27 - 04 - 27 - 10:57
 * @Description: com.was.community.Dao
 * @version: 1.0
 */

@Mapper
public interface UserMapper {

    User selectById(int id);

    User selectByName(String username);

    User selectByEmail(String email);

    int insertUser(User user);

    int updateStatus(int id, int status);

    int updateHeader(int id, String headerUrl);

    int updatePassword(int id, String password);

}
