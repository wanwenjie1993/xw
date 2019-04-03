package com.wwj1.service;

import java.util.List;
import com.wwj1.entity.TImg;

public interface ImgService {
    public TImg selectByPrimaryKey(int id);
    

    public List<TImg> selectByName(String picName, int currPage, int pageSize);

    boolean addImg(TImg record);

}