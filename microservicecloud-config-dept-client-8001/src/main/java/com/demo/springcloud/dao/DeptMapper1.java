package com.demo.springcloud.dao;

import com.demo.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author libohan
 * @date 2019/9/8
 */
@Mapper
public interface DeptMapper1 {
     boolean addDept(Dept dept);
     Dept findById(Long id);
     List<Dept> findAll();
}
