package com.demo.springcloud.service.impl;

import com.demo.springcloud.dao.DeptMapper1;
import com.demo.springcloud.entities.Dept;
import com.demo.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author libohan
 * @date 2019/9/10
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptMapper1 deptMapper1;
    @Override
    public boolean add(Dept dept) {
        return this.deptMapper1.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return this.deptMapper1.findById(id);
    }

    @Override
    public List<Dept> list() {
        return this.deptMapper1.findAll();
    }
}
