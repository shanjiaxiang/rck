package com.rcb.rck.controller;


import com.rcb.rck.common.ApiRestResponse;
import com.rcb.rck.common.Constant;
import com.rcb.rck.exception.RckException;
import com.rcb.rck.exception.RckExceptionEnum;
import com.rcb.rck.model.pojo.User;
import com.rcb.rck.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/admin/test")
    @ResponseBody
    public User test(HttpSession session){
        User admin = (User) session.getAttribute(Constant.RCK_USER);
        if (admin!=null){
            session.setAttribute(Constant.RCK_USER, null);
        }
        return userService.getUser();
    }


    @PostMapping("/login")
    @ResponseBody
    public ApiRestResponse login(@RequestParam("userName") String userName, @RequestParam("password") String password,
                                 HttpSession session) throws RckException {
        if (!StringUtils.hasText(userName)){
            return ApiRestResponse.error(RckExceptionEnum.NEED_USER_NAME);
        }
        if (!StringUtils.hasText(password)){
            return ApiRestResponse.error(RckExceptionEnum.NEED_PASSWORD);
        }
        User user = userService.login(userName,password);
        user.setPassword(null);
        session.setAttribute(Constant.RCK_USER, user);
        return ApiRestResponse.success(user);
    }

}
