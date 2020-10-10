package com.example.time.Utils;

import com.example.time.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 *@description: Lambda表达式学习工具类
 *@author jiafeng
 *@date 2020/9/29 0029 09:10
 */
public class LambdaUtil {

    /**
     * 通过某个字段对List进行分组
     * @param employeeList
     * @return
     */
    public static Map<String, List<Employee>> groupByFeild(List<Employee> employeeList){
        Map<String, List<Employee>> map1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getName));
        return map1;
    }

    /**
     * 将某个字段提取出，形成新的list
     * @param employeeList
     * @return
     */
    public static List<String> getOneFeildToList(List<Employee> employeeList){
        List<String> nameList = employeeList.stream().map(Employee::getName).collect(Collectors.toList());
        return nameList;
    }

    /**
     * 根据某个字段正序排序
     * @param employeeList
     * @return
     */
    public static List<Employee> sortAscByEmployeeId(List<Employee> employeeList){
        List<Employee> employees = employeeList.stream().sorted(Comparator.comparing(Employee::getId)).collect(Collectors.toList());
        return employees;
    }

    /**
     * 根据某个字段倒序排序
     * @param employeeList
     * @return
     */
    public static List<Employee> sortDescByEmployeeId(List<Employee> employeeList){
        List<Employee> employees = employeeList.stream().sorted(Comparator.comparing(Employee::getId).reversed()).collect(Collectors.toList());
        return employees;
    }

    /**
     * 去除list中重复数据
     * @param employeeList
     * @return
     */
    public static List<String> distinctList(List<String> employeeList){
        List<String> list = employeeList.stream().distinct().collect(Collectors.toList());
        return list;
    }

    /**
     * 根据条件过滤掉不符合条件的数据并取出第一条数据，没有第一条数据，则为null
     * @param employeeList
     * @return
     */
    public static Employee filterList(List<Employee> employeeList){
        Employee emp = employeeList.stream().filter(employee  -> employee.getId() == 1 || employee.getId() == 2).findFirst().orElse(null);
        return emp;
    }

    /**
     * 将list转换为map
     * @param employeeList
     * @return
     */
    public static Map<Long, Employee> listToMap(List<Employee> employeeList){
        Map<Long, Employee> map = employeeList.stream().collect(Collectors.toMap(Employee::getId,employee -> employee));
        return map;
    }

    /**
     * 去最大值
     * @param integerList
     * @return
     */
    public static Long getMaxInt(List<Employee> integerList){
        Long max = integerList.stream().mapToLong(Employee::getId).max().orElse(-1L);
        return max;
    }

    /**
     * 将map转换为List
     * @param map
     * @return
     */
    public static List<Employee> mapKeyToList(Map<String, Employee> map){
        return map.entrySet().stream().map(v -> v.getValue()).collect(Collectors.toList());
//        return map.values().stream().collect(Collectors.toList());
    }
}
