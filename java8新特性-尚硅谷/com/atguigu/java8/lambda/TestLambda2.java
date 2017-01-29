package com.atguigu.java8.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.junit.Test;

/*
 * һ��Lambda ���ʽ�Ļ����﷨��Java8��������һ���µĲ����� "->" �ò�������Ϊ��ͷ�������� Lambda ������
 *                          ��ͷ�������� Lambda ���ʽ��ֳ������֣�
 * 
 * ��ࣺLambda ���ʽ�Ĳ����б�
 * �ҲࣺLambda ���ʽ������ִ�еĹ��ܣ� �� Lambda ��
 * 
 * �﷨��ʽһ���޲������޷���ֵ
 *      () -> System.out.println("Hello Lambda!");
 * 
 * �﷨��ʽ������һ�������������޷���ֵ
 *      (x) -> System.out.println(x)
 * 
 * �﷨��ʽ������ֻ��һ��������С���ſ���ʡ�Բ�д
 *      x -> System.out.println(x)
 * 
 * �﷨��ʽ�ģ����������ϵĲ������з���ֵ������ Lambda �����ж������
 *      Comparator<Integer> com = (x, y) -> {
 *          System.out.println("����ʽ�ӿ�");
 *          return Integer.compare(x, y);
 *      };
 *
 * �﷨��ʽ�壺�� Lambda ����ֻ��һ����䣬 return �� �����Ŷ�����ʡ�Բ�д
 *      Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
 * 
 * �﷨��ʽ����Lambda ���ʽ�Ĳ����б���������Ϳ���ʡ�Բ�д����ΪJVM������ͨ���������ƶϳ����������ͣ����������ƶϡ�
 *      (Integer x, Integer y) -> Integer.compare(x, y);
 * 
 * ������������һ����ʡ
 * ����������ƶ�����ʡ
 * ��������ʡ��ʡ
 * 
 * ����Lambda ���ʽ��Ҫ������ʽ�ӿڡ���֧��
 * ����ʽ�ӿڣ��ӿ���ֻ��һ�����󷽷��Ľӿڣ���Ϊ����ʽ�ӿڡ� ����ʹ��ע�� @FunctionalInterface ����
 *           ���Լ���Ƿ��Ǻ���ʽ�ӿ�
 */
public class TestLambda2 {
    
    @Test
    public void test1(){
        int num = 0;//jdk 1.7 ǰ�������� final
        
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!" + num);
            }
        };
        
        r.run();
        
        System.out.println("-------------------------------");
        
        Runnable r1 = () -> System.out.println("Hello Lambda!");
        r1.run();
    }
    
    @Test
    public void test2(){
        Consumer<String> con = x -> System.out.println(x);
        con.accept("�Ҵ��й�����䣡");
    }
    
    @Test
    public void test3(){
        Comparator<Integer> com = (x, y) -> {  //����
            System.out.println("����ʽ�ӿ�");
            return Integer.compare(x, y);
        };
    }
    
    @Test
    public void test4(){
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y); //����
    }
    
    @Test
    public void test5(){
//      String[] strs;  //�ֿ�д���У��ϲ�д����
//      strs = {"aaa", "bbb", "ccc"};
        
        List<String> list = new ArrayList<>();
        
        show(new HashMap<>());
    }

    public void show(Map<String, Integer> map){
        
    }
    
    //���󣺶�һ������������
    @Test
    public void test6(){
        Integer num = operation(100, (x) -> x * x);
        System.out.println(num);
        
        System.out.println(operation(200, (y) -> y + 200));
    }
    
    public Integer operation(Integer num, MyFun mf){
        return mf.getValue(num);
    }
}
