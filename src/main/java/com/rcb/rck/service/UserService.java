package com.rcb.rck.service;

import com.rcb.rck.model.pojo.User;

public interface UserService {
    public User getUser();

    public User login(String userName, String password);

    public boolean checkAdminRole(User user);
}
