package com.demo.springcloud.service.impl;

import com.demo.springcloud.dao.DeptMapper;
import com.demo.springcloud.entities.Dept;
import com.demo.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author libohan
 * @date 2019/9/10
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public boolean add(Dept dept) {
        return this.deptMapper.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return this.deptMapper.findById(id);
    }

    @Override
    public List<Dept> list() {
        return this.deptMapper.findAll();
    }
}
