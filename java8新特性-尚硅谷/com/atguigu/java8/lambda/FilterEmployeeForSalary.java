package com.atguigu.java8.lambda;

public class FilterEmployeeForSalary implements MyPredicate<Employee> {

    @Override
    public boolean test(Employee t) {
        return t.getSalary() >=5000;
    }

}
