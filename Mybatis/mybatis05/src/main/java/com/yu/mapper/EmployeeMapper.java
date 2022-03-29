package com.yu.mapper;

import com.yu.pojo.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {
    /*根据id查询员工*/
    Employee selectById(int id);
    /*查询所有员工*/
    List<Employee> selectAll();
    /*增加一个员工*/
    void addEmployee(Employee employee);
    /*删除一个员工*/
    boolean deleteEmployee(int id);
    /*修改一个员工*/
    void updateEmployee(Employee employee);
    /*以map集合获取一个员工信息*/
    Map<String,Object> getMapById(int id);



}
