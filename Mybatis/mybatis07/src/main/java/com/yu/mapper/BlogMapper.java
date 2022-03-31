package com.yu.mapper;

import com.yu.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    //添加一条blog记录
    int addBlog(Blog blog);
    //查询blog
    List<Blog> query(Map map);

    List<Blog> queryChoose(Map map);

    //更新记录
    int updateBlog(Map map);

    List<Blog> queryForeach(Map map);
}
