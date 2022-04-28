package com.was.community.Dao;

import com.was.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: wasx
 * @Date: 2022/4/27 - 04 - 27 - 13:56
 * @Description: com.was.community.Dao
 * @version: 1.0
 */


@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    //@param 用于给参数起别名。如果只有一个参数并且在《if》里使用 则必须加别名
    int selectDiscussPostRows(@Param("userId") int userId);

}
