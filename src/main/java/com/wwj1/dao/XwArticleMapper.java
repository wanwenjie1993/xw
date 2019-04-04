package com.wwj1.dao;

import com.wwj1.entity.XwArticle;

import java.util.List;

public interface XwArticleMapper {
    int deleteByPrimaryKey(Integer articleid);

    int insert(XwArticle record);

    int insertSelective(XwArticle record);

    XwArticle selectByPrimaryKey(Integer articleid);

    int updateByPrimaryKeySelective(XwArticle record);

    int updateByPrimaryKeyWithBLOBs(XwArticle record);

    int updateByPrimaryKey(XwArticle record);

    List<XwArticle> selectList();
}