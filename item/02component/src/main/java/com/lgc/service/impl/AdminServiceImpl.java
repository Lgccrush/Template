package com.lgc.service.impl;

import com.lgc.entity.Admin;
import com.lgc.entity.AdminExample;
import com.lgc.mapper.AdminMapper;
import com.lgc.service.api.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@Author Crush
 *@Date 2020/5/1 16:29
 *@Vision 1.0
 **/
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public List<Admin> findAll() {

        return adminMapper.selectByExample(new AdminExample());
    }
}
