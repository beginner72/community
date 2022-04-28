package com.was.community.Dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

/**
 * @Auther: wasx
 * @Date: 2022/4/26 - 04 - 26 - 10:13
 * @Description: com.was.community.Dao
 * @version: 1.0
 */

@Repository
@Primary
public class AlphaDaoMybatisImpl implements AlphaDao{
    @Override
    public String select() {
        return "Mybatis";
    }
}
