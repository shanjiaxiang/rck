package com.rcb.rck.service;

import com.github.pagehelper.PageInfo;
import com.rcb.rck.model.pojo.RcInfo;
import com.rcb.rck.model.pojo.User;
import com.rcb.rck.model.request.AddRcInfoReq;
import com.rcb.rck.model.request.RcInfoListReq;
import com.rcb.rck.model.request.UpdateRcInfoReq;

public interface RCService {

    void add(AddRcInfoReq addRcInfoReq);

    void update(UpdateRcInfoReq updateRcInfoReq);

    void delete(Integer id);

    PageInfo selectListForAdmin(Integer pageNum, Integer pageSize);

    RcInfo detail(Integer id);

    PageInfo list(RcInfoListReq rcInfoListReq);
}
