package com.wwj1.dao;

import com.wwj1.entity.TImg;
import java.util.List;
import java.util.Map;


public interface TImgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TImg record);

    int insertSelective(TImg record);
    
    TImg selectByPrimaryKey(Integer id);
    
    List<TImg> selectByName(Map<String, Object> data);

    int updateByPrimaryKeySelective(TImg record);

    int updateByPrimaryKey(TImg record);
}