package com.relflection.sample;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Sample {
    public void test(Object obj) throws Exception{
        Class clazz = obj.getClass();

        System.out.println(clazz.getName());

        Field[] fields = clazz.getDeclaredFields();
        for(Field f: fields) {
            System.out.println(f.getName());
        }

        Method[] methods = clazz.getDeclaredMethods();
        for(Method m: methods) {
            System.out.println(m.getName());
            System.out.println(m.invoke(obj));
        }
    }
}
