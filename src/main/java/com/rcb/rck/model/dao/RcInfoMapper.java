package com.rcb.rck.model.dao;

import com.rcb.rck.model.pojo.RcInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface RcInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RcInfo record);

    int insertSelective(RcInfo record);

    RcInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RcInfo record);

    int updateByPrimaryKey(RcInfo record);
}