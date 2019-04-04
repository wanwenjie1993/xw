package com.wwj1.service;

import com.wwj1.entity.XwArticle;

import java.util.List;

public interface ArticleService {
    public int deleteByPrimaryKey(Integer articleid);

    public int insert(XwArticle record);

    public int insertSelective(XwArticle record);

    public XwArticle selectByPrimaryKey(Integer articleid);

    public int updateByPrimaryKeySelective(XwArticle record);

    public int updateByPrimaryKeyWithBLOBs(XwArticle record);

    public int updateByPrimaryKey(XwArticle record);


    public List<XwArticle> selectList();
}