package com.donghao.test;

import com.cskaoyan.mapper.EmployeeMapper;
import com.cskaoyan.pojo.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class Mytest {
    @Autowired
    EmployeeMapper employeeMapper;
    @Test
    public void mytest(){
        List<Employee> allEmployee = employeeMapper.findAllEmployee();
        System.out.println(allEmployee);
    }

}
