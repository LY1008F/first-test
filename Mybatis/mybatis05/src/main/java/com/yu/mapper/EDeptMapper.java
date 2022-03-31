package com.yu.mapper;

import com.yu.pojo.Dept;
import com.yu.pojo.Employee;

import java.util.List;

public interface EDeptMapper {
    /*根据did查询employee和dept用户*/
    List<Employee> getAllEmp();
//    /*查询员工*/
    Employee getEmpById(int id);
    /*查询dept*/
    Dept getDEById(int id);

    Dept getOnlyDeptById(int id);

    List<Employee> getEmpListById(int id);
}
