package com.wwj1.dao;

public interface XwArticleMapper {
    int deleteByPrimaryKey(Integer articleid);

    int insert(XwArticle record);

    int insertSelective(XwArticle record);

    XwArticle selectByPrimaryKey(Integer articleid);

    int updateByPrimaryKeySelective(XwArticle record);

    int updateByPrimaryKeyWithBLOBs(XwArticle record);

    int updateByPrimaryKey(XwArticle record);
}