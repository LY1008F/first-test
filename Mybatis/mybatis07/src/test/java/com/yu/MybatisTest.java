package com.yu;

import com.yu.mapper.BlogMapper;
import com.yu.pojo.Blog;
import com.yu.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class MybatisTest {
    @Test
    public void addBlog() {
        SqlSession session = MybatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setTitle("spring入门");
        blog.setAuthor("tom");
        blog.setCreateTime(new Date());
        blog.setViews(999);
        mapper.addBlog(blog);
        session.close();

    }

    @Test
    public void queryBlog() {
        SqlSession session = MybatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        Map map = new HashMap();
        map.put("title", "spring入门11");
        map.put("author","jack");
      //  map.put("views", "123");
/*//        List<Blog> query = mapper.query(map);
        List<Blog> queryChoose = mapper.queryChoose(map);
        for (Blog blog : queryChoose) {
            System.out.println(blog);
        }*/
      map.put("id",1);
      mapper.updateBlog(map);
      session.close();
    }
    @Test
    public void queryForeach(){
        SqlSession session = MybatisUtils.getSession();
        BlogMapper mapper = session.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        map.put("ids",integers);
        List<Blog> blogs = mapper.queryForeach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }


        session.close();
    }
}
