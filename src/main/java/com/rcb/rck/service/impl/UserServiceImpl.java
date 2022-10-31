package com.rcb.rck.service.impl;

import com.rcb.rck.exception.RckException;
import com.rcb.rck.exception.RckExceptionEnum;
import com.rcb.rck.model.dao.UserMapper;
import com.rcb.rck.model.pojo.User;
import com.rcb.rck.service.UserService;
import com.rcb.rck.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUser() {
        return userMapper.selectByPrimaryKey(1);
    }


    @Override
    public User login(String userName, String password) throws RckException{
        String md5Password = null;
        try {
            md5Password = MD5Utils.getMD5Str(password);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        User user = userMapper.selectLogin(userName, md5Password);
        if (user ==  null){
            throw new RckException(RckExceptionEnum.WRONG_PASSWORD  );
        }
        return user;
    }


    @Override
    public boolean checkAdminRole(User user){
        return user.getRole().equals(1);
    }
}
