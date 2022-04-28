package com.was.community.service;

import com.was.community.Dao.AlphaDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Auther: wasx
 * @Date: 2022/4/26 - 04 - 26 - 10:27
 * @Description: com.was.community.service
 * @version: 1.0
 */

@Service
public class AlphaService {

    @Autowired
    private AlphaDao alphaDao;

    public AlphaService(){
        System.out.println("实例化AlphaService");
    }

    //在构造器之后调用
    @PostConstruct
    public  void  init(){
        System.out.println("初始化AlphaService");
    }

    //销毁对象之前调用
    @PreDestroy
    public void destroy(){
        System.out.println("销毁AlphaService");
    }

    public String find(){
        return alphaDao.select();
    }
}
