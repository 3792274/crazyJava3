package chapter08_06_java8��ǿ��Map����;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class ForeachMap {
    

    public static void main(String[] args) {
       ArrayList<Map<String, Object>> mapInArrayList = new ArrayList<Map<String, Object>>();
        Map<String, Object> hashMap = new HashMap<String,Object>();
        Person p1 = new Person("aa");
        
        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("c", p1);
        
        mapInArrayList.add(hashMap);
        
        
        //forEachѭ�����޸�ѭ��������ͬʱҲ���޸ı�ѭ������
        for (Map<String, Object> map : mapInArrayList) {
            map.put("a", 3);
            Person p2 = new Person("bb");
            map.put("c", p2);
        }
        System.out.println(mapInArrayList.get(0).get("a")); //3
        System.out.println(mapInArrayList.get(0).get("c")); //Person [name=bb]
    }

}


class Person{
    String name;

    public Person() {
        super();
    }

    public Person(String name) {
        super();
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }
    
}