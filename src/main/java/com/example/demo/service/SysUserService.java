package com.example.demo.service;

import com.example.demo.dao.SysUserRepository;
import com.example.demo.entity.SysUserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;


@Service
public class SysUserService {
    @Autowired
    private SysUserRepository sysUserRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void save(SysUserBean user){
        sysUserRepository.save(user);
        int aa=1/0;
    }

    public List<Map<String,Object>> getAll(){
        return jdbcTemplate.queryForList("select * from sys_user");
    }
}
