package com.atguigu.java8.lambda;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.Test;

/*
 * һ���������ã��� Lambda ���еĹ��ܣ��Ѿ��з����ṩ��ʵ�֣�����ʹ�÷�������
 *            �����Խ������������Ϊ Lambda ���ʽ������һ�ֱ�����ʽ��
 * 
 * 1. ��������� :: ʵ��������
 * 
 * 2. ���� :: ��̬������
 * 
 * 3. ���� :: ʵ��������
 * 
 * ע�⣺
 *   �ٷ������������õķ����Ĳ����б��뷵��ֵ���ͣ���Ҫ�뺯��ʽ�ӿ��г��󷽷��Ĳ����б�ͷ���ֵ���ͱ���һ�£�
 *   ����Lambda �Ĳ����б�ĵ�һ����������ʵ�������ĵ����ߣ��ڶ�������(���޲�)��ʵ�������Ĳ���ʱ����ʽ�� ClassName::MethodName
 * 
 * �������������� :�������Ĳ����б���Ҫ�뺯��ʽ�ӿ��в����б���һ�£�
 * 
 * 1. ���� :: new
 * 
 * ������������
 * 
 *  ����[] :: new;
 * 
 * 
 */
public class TestMethodRef {
    //��������
    @Test
    public void test8(){
        Function<Integer, String[]> fun = (args) -> new String[args];
        String[] strs = fun.apply(10);
        System.out.println(strs.length);
        
        System.out.println("--------------------------");
        
        Function<Integer, Employee[]> fun2 = Employee[] :: new;
        Employee[] emps = fun2.apply(20);
        System.out.println(emps.length);
    }
    
    //����������
    @Test
    public void test7(){
        Function<String, Employee> fun = Employee::new;
        
        BiFunction<String, Integer, Employee> fun2 = Employee::new;
    }
    
    @Test
    public void test6(){
        Supplier<Employee> sup = () -> new Employee();
        System.out.println(sup.get());
        
        System.out.println("------------------------------------");
        
        Supplier<Employee> sup2 = Employee::new;
        System.out.println(sup2.get());
    }
    
    //���� :: ʵ��������
    @Test
    public void test5(){
        BiPredicate<String, String> bp = (x, y) -> x.equals(y);
        System.out.println(bp.test("abcde", "abcde"));
        
        System.out.println("-----------------------------------------");
        
        BiPredicate<String, String> bp2 = String::equals;
        System.out.println(bp2.test("abc", "abc"));
        
        System.out.println("-----------------------------------------");
        
        
        Function<Employee, String> fun = (e) -> e.show();
        System.out.println(fun.apply(new Employee()));
        
        System.out.println("-----------------------------------------");
        
        Function<Employee, String> fun2 = Employee::show;
        System.out.println(fun2.apply(new Employee()));
        
    }
    
    //���� :: ��̬������
    @Test
    public void test4(){
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
        
        System.out.println("-------------------------------------");
        
        Comparator<Integer> com2 = Integer::compare;
    }
    
    @Test
    public void test3(){
        BiFunction<Double, Double, Double> fun = (x, y) -> Math.max(x, y);
        System.out.println(fun.apply(1.5, 22.2));
        
        System.out.println("--------------------------------------------------");
        
        BiFunction<Double, Double, Double> fun2 = Math::max;
        System.out.println(fun2.apply(1.2, 1.5));
    }

    //��������� :: ʵ��������
    @Test
    public void test2(){
        Employee emp = new Employee(101, "����", 18, 9999.99);
        
        Supplier<String> sup = () -> emp.getName();
        System.out.println(sup.get());
        
        System.out.println("----------------------------------");
        
        Supplier<String> sup2 = emp::getName;
        System.out.println(sup2.get());
    }
    
    @Test
    public void test1(){
        PrintStream ps = System.out;
        Consumer<String> con = (str) -> ps.println(str);
        con.accept("Hello World��");
        
        System.out.println("--------------------------------");
        
        Consumer<String> con2 = ps::println;
        con2.accept("Hello Java8��");
        
        Consumer<String> con3 = System.out::println;
    }
    
}
