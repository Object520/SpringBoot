package com.example.demo.controller;

import com.example.demo.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    /**
    * @Description: 提供服务
    * @Param:
    * @return: java.util.List<User>
    */
    @RequestMapping(value = "/getList")
    public List<User> getList() {
        List<User> list = new ArrayList<>();
        list.add(new User("王五", "深圳", 25));
        list.add(new User("李四", "北京", 23));
        list.add(new User("赵六", "上海", 26));
        return list;
    }
}
