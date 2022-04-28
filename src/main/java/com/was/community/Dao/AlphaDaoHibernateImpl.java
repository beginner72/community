package com.was.community.Dao;

import org.springframework.stereotype.Repository;

/**
 * @Auther: wasx
 * @Date: 2022/4/26 - 04 - 26 - 10:00
 * @Description: com.was.community.Dao
 * @version: 1.0
 */

@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{
    @Override
    public String select() {
        return "Hibernate";
    }
}
