package com.yu.mapper;

import com.yu.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EmployeeMapper {
    /*根据id查询员工*/
    Employee selectById(int id);
    /*查询所有员工*/
    List<Employee> selectAll();
    /*增加一个员工*/
    int addEmployee(Employee employee);
    /*删除一个员工*/
    int deleteEmployee(int id);
    /*修改一个员工*/
    int updateEmployee(Employee employee);
    /*以map集合获取一个员工信息*/
    Map<String,Object> getMapById(int id);
    /*根据id和name查询员工*/
    /*命名参数*/
    Employee getByIdAndName(@Param("id") int id,@Param("lastName") String lastname);
    /*传入map值查询员工*/
    Employee getEmpByMap(Map<String,Object> map);
}
