package com.demo.springcloud.service;

import com.demo.springcloud.dao.DeptMapper;
import com.demo.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author libohan
 * @date 2019/9/10
 */

public interface DeptService {
    public boolean add(Dept dept);
    public Dept get(Long id);
    public List<Dept> list();

    /**
     * @author libohan
     * @date 2019/9/10
     */
    @Service
    class DeptServiceImpl implements DeptService {
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
}
