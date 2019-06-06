package com.example.demo.controller;

import com.example.demo.Service.UserService;
import com.example.demo.po.UserPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhangleishuidihuzhu.com on 2019/6/5.
 */
@RequestMapping(value = "/redis/demo/user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getuser")
    public UserPo selectOne(@RequestParam("id") Long id) {
        return userService.queryUserByPrimary(id);
    }

    @PostMapping("/adduser")
    public int addUserSelective(String userName, Integer sex, Integer age) {
        UserPo userPo = new UserPo();
        userPo.setUserName(userName);
        userPo.setSex(sex);
        userPo.setAge(age);
        return userService.addUserSelective(userPo);
    }

    @PostMapping("/updateuser")
    public int updateUserSelective(UserPo userPo) {
        return userService.updateUserSelective(userPo);
    }
}
