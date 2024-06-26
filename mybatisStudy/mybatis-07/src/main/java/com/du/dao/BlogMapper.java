package com.du.dao;

import com.du.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    int addBlog(Blog blog);
    List<Blog> queryBlogIF(Map map);
    List<Blog> queryBlogChoose(Map map);
    List<Blog> queryBlogForeach(Map map);
}
