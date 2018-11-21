package com.example.demo.controller;

import com.example.demo.entity.SysUserBean;
import com.example.demo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }

    @RequestMapping("/save")
    public String save(SysUserBean user){
        sysUserService.save(user);
        return "hello";
    }

    @RequestMapping("/get_all")
    public List<Map<String, Object>> getAll(){
        return sysUserService.getAll();
    }

}









