package com.demo.springcloud.service;

import com.demo.springcloud.entities.Dept;

import java.util.List;

/**
 * @author libohan
 * @date 2019/9/10
 */

public interface DeptService {
    public boolean add(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();

}
