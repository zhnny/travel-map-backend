package cn.csu.travelmapbackend.controller;

import cn.csu.travelmapbackend.pojo.User;
import cn.csu.travelmapbackend.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class HelloWorld {

    final
    UserServiceImpl userService;

    public HelloWorld(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        List<User> userList= userService.getUsers();
        return userList.toString();
    }
}
