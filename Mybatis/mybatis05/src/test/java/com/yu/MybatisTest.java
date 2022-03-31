package com.yu;

import com.yu.mapper.DeptMapper;
import com.yu.mapper.EDeptMapper;
import com.yu.mapper.EmployeeMapper;
import com.yu.pojo.Dept;
import com.yu.pojo.Employee;
import com.yu.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {
    /*根据id查询员工*/
    @Test
    public void selectbyid() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = mapper.selectById(1);
        System.out.println(employee);
        sqlSession.close();
    }

    /*查询所有员工*/
    @Test
    public void selectAll() {
        SqlSession session = MybatisUtils.getSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        List<Employee> employees = mapper.selectAll();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        session.close();
    }

    /*添加员工*/
    @Test
    public void addEmployee() {
        SqlSession session = MybatisUtils.getSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
//        Employee employee = new Employee(null,"op7","5454@qq.com","男");
//        mapper.addEmployee(employee);
//        System.out.println(employee.getId());

        session.close();
    }

    /*删除员工*/
    @Test
    public void deleteEmployee() {
        SqlSession session = MybatisUtils.getSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        mapper.deleteEmployee(3);
//        int i = mapper.deleteEmployee(3);
//        boolean b = mapper.deleteEmployee(3);
        session.commit();//事务手动提交，  SqlSession openSession(boolean autoCommit);ture自动提交事务
        session.close();
    }

    /*修改员工*/
    @Test
    public void updateEmployee() {
        SqlSession session = MybatisUtils.getSession();
        EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        Employee employee = mapper.selectById(4);
        employee.setLastName("op4");
        mapper.updateEmployee(employee);
        session.commit();
        session.close();

    }

    /*查询一个员工信息*/
    @Test
    public void getMapById() {
    SqlSession session = MybatisUtils.getSession();
  //  EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
//        Employee employee = mapper.getByIdAndName(5, "op5");
//        System.out.println(employee);
//        Map<String,Object> map=new HashMap<>();
//        map.put("id1",6);
//        map.put("lastName1","op6");
//        Employee empByMap = mapper.getEmpByMap(map);
//        System.out.println(empByMap);
        EDeptMapper mapper = session.getMapper(EDeptMapper.class);
//        List<Employee> emp = mapper.getAllEmp();
//        for (Employee employee : emp) {
//            System.out.println(employee);
//
//        }
//        Employee emp = mapper.getEmpById(1);
//        System.out.println(emp.getLastName());
//        Dept dept = mapper.getDEById(1);
        Dept dept = mapper.getOnlyDeptById(1);

        System.out.println(dept.getDname());


        session.close();

    }
    /*查询部门信息*/
    @Test
    public void getDeptById(){
        SqlSession session = MybatisUtils.getSession();
        DeptMapper mapper = session.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptById(1);
        System.out.println(dept);

    }

}