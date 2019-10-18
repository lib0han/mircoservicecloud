package com.demo.springcloud.service;

import com.demo.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author libohan
 * @date 2019/9/22
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory=DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @RequestMapping(value = "/dept/add")
    public boolean add(Dept dept);

    @RequestMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id);

    @RequestMapping(value = "/dept/list")
    public List<Dept> list();
}
