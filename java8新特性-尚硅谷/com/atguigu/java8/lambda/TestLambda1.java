package com.atguigu.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import org.junit.Test;

public class TestLambda1 {

    //ԭ��ʹ�������ڲ���
    @Test
    public void test1() {
        Comparator<String> com = new Comparator<String>() {

            @Override
            public int compare(String x, String y) {
                return Integer.compare(x.length(), y.length());
            }
        };

        TreeSet<String> ts1 = new TreeSet<>(com);

        TreeSet<String> ts2 = new TreeSet<>(new Comparator<String>() {

            @Override
            public int compare(String x, String y) {
                return Integer.compare(x.length(), y.length());
            }
        });

    }

    //����ʹ��Lambda���ʽ
    @Test
    public void test2() {
        Comparator<String> com = (x, y) -> Integer.compare(x.length(), y.length());
        TreeSet<String> ts = new TreeSet<>(com);
    }

    List<Employee> emps = Arrays.asList(
        new Employee(101, "����", 18, 9999.99), 
        new Employee(102, "����", 59, 6666.66), 
        new Employee(103, "����", 28, 3333.33), 
        new Employee(104, "����", 8, 7777.77), 
        new Employee(105, "����", 38, 5555.55)
     );

    //  ���󣺻�ȡ��˾������С�� 35 ��Ա����Ϣ
    public List<Employee> filterEmployeeByAge(List<Employee> emps) {
        List<Employee> list = new ArrayList<>();
        for (Employee employee : emps) {
            if (employee.getAge() <= 35) {
                list.add(employee);
            }
        }
        return list;
    }

    @Test
    public void test3() {
        List<Employee> list = filterEmployeeByAge(emps);
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    //���󣺻�ȡ��˾�й��ʴ��� 5000 ��Ա����Ϣ
    public List<Employee> filterEmployeeBySalary(List<Employee> emps) {
        List<Employee> list = new ArrayList<>();
        for (Employee employee : emps) {
            if (employee.getSalary() >= 5000) {
                list.add(employee);
            }
        }
        return list;
    }

    //�Ż���ʽһ������ģʽ
    public List<Employee> filterEmployee(List<Employee> emps, MyPredicate<Employee> mp) {
        List<Employee> list = new ArrayList<>();
        for (Employee employee : emps) {
            if (mp.test(employee)) {
                list.add(employee);
            }
        }
        return list;
    }

    
    @Test
    public void test4() {
        List<Employee> list = filterEmployee(emps, new FilterEmployeeForAge());
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
    
    
    
    //�Ż���ʽ���������ڲ���
    @Test
    public void test5(){
        List<Employee> list = filterEmployee(emps, new MyPredicate<Employee>() {
            @Override
            public boolean test(Employee t) {
                return  t.getId()<=103;
            }
        });
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    
    //�Ż���ʽ����Lambda���ʽ
    @Test
    public void test6(){
        List<Employee> list = filterEmployee(emps, (e) -> e.getSalary()>=5000);
        list.forEach(System.out::println);
        System.out.println("--------------------------------------------");
        List<Employee> list2 = filterEmployee(emps, (e) -> e.getAge()<=35);
        list2.forEach(System.out::println);
    }
    
    
    //�Ż���ʽ�ģ�Stream API
    @Test
    public void test7(){
        emps.stream()
            .filter((e) -> e.getAge()>=35)
            .forEach(System.out::println);
        System.out.println("--------------------------------------------");
        
        emps.stream()
            .map(Employee::getName)
            .limit(3)
            .sorted()
            .forEach(System.out::println);
    }
}
