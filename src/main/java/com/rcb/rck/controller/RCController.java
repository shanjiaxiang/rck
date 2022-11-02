package com.rcb.rck.controller;


import com.rcb.rck.common.ApiRestResponse;
import com.rcb.rck.model.request.AddRcInfoReq;
import com.rcb.rck.service.RCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class RCController {

    @Autowired
    RCService rcService;

    @PostMapping("/admin/rc/add")
    public ApiRestResponse addRC(@Valid  AddRcInfoReq addRcInfoReq){
        rcService.add(addRcInfoReq);
        return ApiRestResponse.success();
    }



}
