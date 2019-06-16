package cctv.come.service.impl;

import cctv.come.dao.UserDao;
import cctv.come.service.UserService;

public class UserServiceImpl implements UserService {


    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void show() {
        userDao.show();

    }
}
