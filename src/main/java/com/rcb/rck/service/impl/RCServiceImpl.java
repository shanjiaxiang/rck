package com.rcb.rck.service.impl;

import com.github.pagehelper.PageInfo;
import com.rcb.rck.exception.RckException;
import com.rcb.rck.exception.RckExceptionEnum;
import com.rcb.rck.model.dao.RcInfoMapper;
import com.rcb.rck.model.pojo.RcInfo;
import com.rcb.rck.model.request.AddRcInfoReq;
import com.rcb.rck.model.request.RcInfoListReq;
import com.rcb.rck.model.request.UpdateRcInfoReq;
import com.rcb.rck.service.RCService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RCServiceImpl implements RCService {

    @Autowired
    RcInfoMapper rcInfoMapper;

    @Override
    public void add(AddRcInfoReq addRcInfoReq) {
        RcInfo rcInfo = new RcInfo();
        BeanUtils.copyProperties(addRcInfoReq, rcInfo);
//        RcInfo existed = rcInfoMapper.selectByName(rcInfo.getName());
//        if (existed!=null){
//            throw new RckException(RckExceptionEnum.NAME_EXITED);
//        }
        System.out.println(rcInfo);
        int count = rcInfoMapper.insertSelective(rcInfo);
        if (count==0){
            throw new RckException(RckExceptionEnum.INSERT_FAILED);
        }
    }

    @Override
    public void update(UpdateRcInfoReq updateRcInfoReq) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public PageInfo selectListForAdmin(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public RcInfo detail(Integer id) {
        return null;
    }

    @Override
    public PageInfo list(RcInfoListReq rcInfoListReq) {
        return null;
    }
}
