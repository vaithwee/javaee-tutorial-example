package xyz.vaith.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import xyz.vaith.domain.Employee;
import xyz.vaith.mapper.EmployeeMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AppTest {
    @Test
    public void test1() throws IOException {
        EmployeeMapper employeeMapper = getEmployeeMapper();
        HashMap<String, Object> params = new HashMap<>();
//        params.put("id", 1);
        List<Employee> list = employeeMapper.selectEmployeeByIdLike(params);
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    private EmployeeMapper getEmployeeMapper() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-cfg.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        return session.getMapper(EmployeeMapper.class);
    }

    @Test
    public void test2() throws IOException {
        EmployeeMapper employeeMapper = getEmployeeMapper();
        HashMap<String, Object> params = new HashMap<>();
        params.put("loginname", "jack");
        params.put("password", "123456");
        List<Employee> list = employeeMapper.selectEmployeeByLoginLike(params);
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    @Test
    public void test3() throws IOException {
        EmployeeMapper employeeMapper = getEmployeeMapper();
        HashMap<String, Object> params = new HashMap<>();
//        params.put("id", 1);
//        params.put("loginname", "jack");
//        params.put("password", "123456");
        List<Employee> list = employeeMapper.selectEmployeeChoose(params);
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
    @Test
    public void test4() throws IOException {
        EmployeeMapper employeeMapper = getEmployeeMapper();
        HashMap<String, Object> params = new HashMap<>();
        params.put("id", 1);
        params.put("loginname", "jack");
        params.put("password", "123456");
        List<Employee> list = employeeMapper.selectEmployeeLike(params);
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
    @Test
    public void test5() throws IOException {
        EmployeeMapper employeeMapper = getEmployeeMapper();
        Employee employee = employeeMapper.selectEmployeeById(4);
        employee.setLoginname("mary");
        employee.setPassword("123");
        employee.setName("玛丽");
        employeeMapper.updateEmployeeIfNecessary(employee);
    }
    @Test
    public void test6() throws IOException {
        EmployeeMapper employeeMapper = getEmployeeMapper();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        List<Employee> employees = employeeMapper.selectEmployeeIn(list);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    @Test
    public void test7() throws IOException {
        EmployeeMapper employeeMapper = getEmployeeMapper();
       Employee employee = new Employee();
       employee.setName("o");
        List<Employee> employees = employeeMapper.selectEmployeeLikeName(employee);
        for (Employee employee1 : employees) {
            System.out.println(employee1);
        }
    }
}
