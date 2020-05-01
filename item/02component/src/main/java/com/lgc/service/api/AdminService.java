package com.lgc.service.api;

import com.lgc.entity.Admin;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@Author Crush
 *@Date 2020/5/1 16:28
 *@Vision 1.0
 **/
//@Service
public interface AdminService {
    List<Admin> findAll();
}
