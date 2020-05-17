package com.personal.service;


import com.personal.domain.UserSay;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IUserSayService {
    //查看所有留言
    List<UserSay> findAll() throws Exception;
    //插入一条留言
    void insertUserSay(UserSay userSay) throws Exception;
    //删除一条留言
    void deleteUserSay(String userSayId) throws Exception;

}
