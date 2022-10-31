package com.rcb.rck.model.dao;

import com.rcb.rck.model.pojo.Policy;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Policy record);

    int insertSelective(Policy record);

    Policy selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Policy record);

    int updateByPrimaryKey(Policy record);
}