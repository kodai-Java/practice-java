package com.relflection.sample;

public class Item {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Item(int id, String name){
        this.id= id;
        this.name = name;
    }
}
