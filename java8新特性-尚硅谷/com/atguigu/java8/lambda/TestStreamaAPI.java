package com.atguigu.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import org.junit.Test;

/*
 * һ��Stream API �Ĳ������裺
 * 
 * 1. ���� Stream
 * 
 * 2. �м����
 * 
 * 3. ��ֹ����(�ն˲���)
 */
public class TestStreamaAPI {
    
    //1. ���� Stream
    @Test
    public void test1(){
        //1. Collection �ṩ����������  stream() �� parallelStream()
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream(); //��ȡһ��˳����
        Stream<String> parallelStream = list.parallelStream(); //��ȡһ��������
        
        //2. ͨ�� Arrays �е� stream() ��ȡһ��������
        Integer[] nums = new Integer[10];
        Stream<Integer> stream1 = Arrays.stream(nums);
        
        //3. ͨ�� Stream ���о�̬���� of()
        Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6);
        
        //4. ����������
        //����
        Stream<Integer> stream3 = Stream.iterate(0, (x) -> x + 2).limit(10);
        stream3.forEach(System.out::println);
        
        //����
        Stream<Double> stream4 = Stream.generate(Math::random).limit(2);
        stream4.forEach(System.out::println);
        
    }
    
    //2. �м����
    List<Employee> emps = Arrays.asList(
            new Employee(102, "����", 59, 6666.66),
            new Employee(101, "����", 18, 9999.99),
            new Employee(103, "����", 28, 3333.33),
            new Employee(104, "����", 8, 7777.77),
            new Employee(104, "����", 8, 7777.77),
            new Employee(104, "����", 8, 7777.77),
            new Employee(105, "����", 38, 5555.55)
    );
    
    /*
      ɸѡ����Ƭ
        filter�������� Lambda �� �������ų�ĳЩԪ�ء�
        limit�����ض�����ʹ��Ԫ�ز���������������
        skip(n) ���� ����Ԫ�أ�����һ���ӵ���ǰ n ��Ԫ�ص�����������Ԫ�ز��� n �����򷵻�һ���������� limit(n) ����
        distinct����ɸѡ��ͨ����������Ԫ�ص� hashCode() �� equals() ȥ���ظ�Ԫ��
     */
    
    //�ڲ��������������� Stream API �ڲ����
    @Test
    public void test2(){
        //���е��м�����������κεĴ���
        Stream<Employee> stream = emps.stream()
            .filter((e) -> {
                System.out.println("�����м����");
                return e.getAge() <= 35;
            });
        
        //ֻ�е�����ֹ����ʱ�����е��м������һ���Ե�ȫ��ִ�У���Ϊ��������ֵ��
        stream.forEach(System.out::println);
    }
    
    //�ⲿ����
    @Test
    public void test3(){
        Iterator<Employee> it = emps.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
    @Test
    public void test4(){
        emps.stream()
            .filter((e) -> {
                System.out.println("��·��"); // &&  ||
                return e.getSalary() >= 5000;
            }).limit(3)
            .forEach(System.out::println);
    }
    
    @Test
    public void test5(){
        emps.parallelStream()
            .filter((e) -> e.getSalary() >= 5000)
            .skip(2)
            .forEach(System.out::println);
    }
    
    @Test
    public void test6(){
        emps.stream()
            .distinct()
            .forEach(System.out::println);
    }
}
