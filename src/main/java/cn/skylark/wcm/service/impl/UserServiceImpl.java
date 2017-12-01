package cn.skylark.wcm.service.impl;

import java.util.List;

import cn.skylark.wcm.service.UserService;
import cn.skylark.wcm.dao.UserDao;
import cn.skylark.wcm.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    public User getUser(Integer id) {
        User user=new User();
        user.setId(id);

        return userDao.selectOne(user);
    }
    @Override
    public List<User> getUsers() {
        // TODO Auto-generated method stub
        return userDao.selectAll();
    }

    public boolean addUser(User user) {
        return userDao.insert(user) > 0;
    }
}