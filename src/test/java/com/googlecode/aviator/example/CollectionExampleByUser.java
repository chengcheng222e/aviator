package com.googlecode.aviator.example;

import com.googlecode.aviator.AviatorEvaluator;

import java.util.*;


public class CollectionExampleByUser {
    public static void main(String[] args) {
        final List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add(" world");

        final int[] array = new int[3];
        array[0] = 0;
        array[1] = 1;
        array[2] = 3;

        final Map<String, Date> map = new HashMap<String, Date>();
        map.put("date", new Date());

        final Map<String, Object> customer = new HashMap<String, Object>();
        customer.put("user", new User("chenyuan", "深圳南山区"));
        customer.put("list", list);

        Map<String, Object> env = new HashMap<String, Object>();
        env.put("list", list);
        env.put("array", array);
        env.put("mmap", map);
        env.put("customer", customer);

        System.out.println(AviatorEvaluator.execute("list[0]+list[1]", env));
        System.out.println(AviatorEvaluator.execute("'array[0]+array[1]+array[2]='+(array[0]+array[1]+array[2])", env));
        System.out.println(AviatorEvaluator.execute("'today is '+mmap.date ", env));
        System.out.println(AviatorEvaluator.execute("customer.user.userName", env));
        System.out.println(AviatorEvaluator.execute("customer.list[1]", env));
        System.out.println(AviatorEvaluator.execute("list[1]", env));
    }
}
