package com.was.community;

import com.was.community.Dao.DiscussPostMapper;
import com.was.community.Dao.UserMapper;
import com.was.community.entity.DiscussPost;
import com.was.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

/**
 * @Auther: wasx
 * @Date: 2022/4/27 - 04 - 27 - 13:00
 * @Description: com.was.community
 * @version: 1.0
 */

@SpringBootTest
@ContextConfiguration(classes=CommunityApplication.class)
public class MapperTest {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    public void testSelectUser(){
        User user = userMapper.selectById(101);
        System.out.println(user);
    }

    @Test
    public void testSelectPost(){
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(0, 0, 10);
        for (DiscussPost post : discussPosts){
            System.out.println(post);
        }
    }

}
