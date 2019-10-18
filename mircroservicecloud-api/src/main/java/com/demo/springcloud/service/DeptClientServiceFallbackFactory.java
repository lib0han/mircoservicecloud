package com.demo.springcloud.service;

import com.demo.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 服务降级处理是在客户端实现完成的，与服务端没有关系
 * 相当于spring的aop(环绕通知),在接口上做文章,做到与controller解耦,
 * @author libohan
 * @date 2019/10/11
 */
@Component//不要忘记添加，不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable cause) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptno(id)
               .setDname("该ID："+id+"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
               .setDb_source("no this database in MySQL");
     }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
