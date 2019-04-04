package com.wwj1.service;


import com.wwj1.dao.XwArticleMapper;
import com.wwj1.entity.XwArticle;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service("ArticleService")
public class ArticleServiceImpl implements ArticleService {

    @Resource
    private XwArticleMapper articleMapper;

    @Override
    public int deleteByPrimaryKey(Integer articleid) {
        return articleMapper.deleteByPrimaryKey(articleid);
    }

    @Override
    public int insert(XwArticle record) {
        return articleMapper.insert(record);
    }

    @Override
    public int insertSelective(XwArticle record) {
        return articleMapper.insertSelective(record);
    }

    @Override
    public XwArticle selectByPrimaryKey(Integer articleid) {
        return articleMapper.selectByPrimaryKey(articleid);
    }

    @Override
    public int updateByPrimaryKeySelective(XwArticle record) {
        return articleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(XwArticle record) {
        return articleMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(XwArticle record) {
        return articleMapper.updateByPrimaryKey(record);
    }


    @Override
    public List<XwArticle> selectList() {
        return articleMapper.selectList();
    }
}