package com.relflection.sample;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception{
        // Itemクラスのメタ情報を取得している
        Class<Item> clazz = Item.class;
        // フィールドを取得、そのクラスがどんなフィールドをもっているのか調べる
        Field[] fields = clazz.getDeclaredFields();
        for (Field f: fields) {
            System.out.println(f.getName());
        }
        Sample sample = new Sample();
        sample.test(new Item(100, "apple"));
    }
}
