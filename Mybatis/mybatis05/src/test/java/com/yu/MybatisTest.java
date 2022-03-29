package com.yu;

import com.yu.mapper.EmployeeMapper;
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
import java.util.Map;

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
        Employee employee = new Employee();
        employee.setLastName("op2");
        employee.setEmail("4456645@qq.com");
        employee.setGender("男");

        mapper.addEmployee(employee);
        session.commit();
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
        session.commit();
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

    /*以map返回一个员工信息*/
    @Test
    public void getMapById() {
    SqlSession session = MybatisUtils.getSession();
    EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
        Map<String, Object> mapById = mapper.getMapById(4);
        System.out.println(mapById);
        session.close();

    }
}