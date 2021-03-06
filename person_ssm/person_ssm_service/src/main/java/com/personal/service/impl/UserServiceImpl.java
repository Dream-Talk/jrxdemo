package com.personal.service.impl;

import com.personal.dao.IUserDao;
import com.personal.domain.Role;
import com.personal.domain.UserInfo;
import com.personal.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl  implements IUserService{
    @Autowired
    private IUserDao userDao;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInfo userInfo = null;
        User user = null;
        try {
            userInfo = userDao.findByUsername(username);
            user = new User(userInfo.getUsername(), userInfo.getPassword(), userInfo.getStatus() == 0 ? false : true, true, true, true, getAuthority(userInfo.getRoles()));
        }catch (NullPointerException e){
            System.out.println("用户名和密码不正确");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        //处理自己的用户对象封装成UserDetails
        //  User user=new User(userInfo.getUsername(),"{noop}"+userInfo.getPassword(),getAuthority(userInfo.getRoles()));

        return user;
    }

    //作用就是返回一个List集合，集合中装入的是角色描述
    public List<SimpleGrantedAuthority> getAuthority(List<Role> roles) {

        List<SimpleGrantedAuthority> list = new ArrayList<>();
        for (Role role : roles) {
            list.add(new SimpleGrantedAuthority("ROLE_" + role.getRoleName()));
        }
        return list;
    }


    @Override
    public List<UserInfo> findAll() throws Exception {
        return userDao.findAll();
    }

    @Override
    public void save(UserInfo info) throws Exception {
        info.setPassword(encoder.encode(info.getPassword()));
        userDao.save(info);
    }

    @Override
    public UserInfo findUserById(String userId) throws Exception {
        return userDao.findUserById(userId);
    }

    @Override
    public List<Role> findOtherRoles(String userId) throws Exception {
        return userDao.findOtherRoles(userId);
    }

    @Override
    public void addRoleToUser(String userId, String[] roleIds) throws Exception {
        for (String roleId:roleIds) {
            userDao.addRoleToUser(userId,roleId);
        }
    }
}
