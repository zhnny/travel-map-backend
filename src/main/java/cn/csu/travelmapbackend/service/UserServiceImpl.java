package cn.csu.travelmapbackend.service;

import cn.csu.travelmapbackend.dao.UserMapper;
import cn.csu.travelmapbackend.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    final
    UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> getUsers() {
        return userMapper.getAllUser();
    }

}
