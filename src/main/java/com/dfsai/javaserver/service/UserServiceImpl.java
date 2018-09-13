package com.dfsai.javaserver.service;

import com.dfsai.javaserver.dao.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserInfoMapper userDao;

    @Override
    public List findAllUsers() {
        return userDao.findAllUsers();
    }
}
