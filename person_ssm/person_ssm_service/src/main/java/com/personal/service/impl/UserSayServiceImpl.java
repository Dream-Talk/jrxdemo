package com.personal.service.impl;

import com.personal.dao.IUserSayDao;
import com.personal.domain.UserSay;
import com.personal.service.IUserSayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserSayServiceImpl implements IUserSayService {
    @Autowired
    private IUserSayDao userSayDao;


    @Override
    public List<UserSay> findAll() throws Exception {

        List<UserSay> userSayList = userSayDao.findAll();

        return userSayList;
    }

    @Override
    public void insertUserSay(UserSay userSay) throws Exception {
        userSayDao.insertUserSay(userSay);
    }

    @Override
    public void deleteUserSay(String userSayId) throws Exception {
        userSayDao.deleteUserSay(userSayId);
    }


}
