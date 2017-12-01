package cn.skylark.wcm.service;

import java.util.List;
import cn.skylark.wcm.entity.User;
public interface UserService {

public User getUser(Integer id);
public List<User> getUsers();
public boolean addUser(User user);
}